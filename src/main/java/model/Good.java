package model;

import javax.persistence.*;

/**
 * Created by Sergey on 13.02.2016.
 */
@Entity
@Table(name="good")
public class Good {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="barcode")
    private String barcode;

    @Column(name="article")
    private String article;

    @Column(name="purchase_price")
    private double purchasePrice;

    @Column(name="price")
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "good_type_id")
    private GoodType goodType;

    public Good(){

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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GoodType getGoodType() {
        return goodType;
    }

    public void setGoodTypeId(GoodType goodType) {
        this.goodType = goodType;
    }
}
