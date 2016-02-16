package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Sergey on 14.02.2016.
 */
@Entity
@Table(name = "income_invoice")
public class IncomeInvoice {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "date")
    private Date date;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="incomeInvoice")
    private List<IncomeCompositon> incomeCompositonList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public IncomeInvoice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<IncomeCompositon> getIncomeCompositonList() {
        return incomeCompositonList;
    }

    public void setIncomeCompositonList(List<IncomeCompositon> incomeCompositonList) {
        this.incomeCompositonList = incomeCompositonList;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
