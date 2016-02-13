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
    private GoodType goodTypeId;

    public Good(){

    }
}
