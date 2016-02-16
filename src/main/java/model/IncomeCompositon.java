package model;

import javax.persistence.*;

/**
 * Created by Sergey on 14.02.2016.
 */
@Entity
@Table(name = "income_composition")
public class IncomeCompositon {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "income_invoice_id")
    private IncomeInvoice incomeInvoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "good_id")
    private Good good;

    public IncomeCompositon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IncomeInvoice getIncomeInvoice() {
        return incomeInvoice;
    }

    public void setIncomeInvoice(IncomeInvoice incomeInvoice) {
        this.incomeInvoice = incomeInvoice;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

}
