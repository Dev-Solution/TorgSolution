package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Sergey on 13.02.2016.
 */
@Entity
@Table(name="good_type")
public class GoodType {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="goodTypeId")
    private List<Good> goods;

    public GoodType(){

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

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
