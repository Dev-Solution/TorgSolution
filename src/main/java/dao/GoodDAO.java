package dao;

import model.Good;

import java.util.List;

/**
 * Created by Sergey on 13.02.2016.
 */
public interface GoodDAO {
    public void addGood(Good good);
    public List<Good> getAllGood();
    public void deleteGood(Integer goodId);


}
