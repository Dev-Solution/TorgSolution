package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Sergey on 14.02.2016.
 */
@Entity
@Table(name="shop")
public class Shop {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="shop")
    private List<Warehouse> warehouseList;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="shop")
    private List<IncomeInvoice> incomeInvoiceList;

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public List<IncomeInvoice> getIncomeInvoiceList() {
        return incomeInvoiceList;
    }

    public void setIncomeInvoiceList(List<IncomeInvoice> incomeInvoiceList) {
        this.incomeInvoiceList = incomeInvoiceList;
    }
}
