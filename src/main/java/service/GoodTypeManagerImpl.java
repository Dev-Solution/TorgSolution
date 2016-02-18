package service;


import dao.GoodTypeDAO;
import model.GoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Sergey on 17.02.2016.
 */

@Service("goodTypeManager")
public class GoodTypeManagerImpl implements GoodTypeManager {

    @Autowired
    GoodTypeDAO goodTypeDAO;

    public void setGoodTypeDAO(GoodTypeDAO goodTypeDAO) {
        this.goodTypeDAO = goodTypeDAO;
    }

    @Override

    public void addGoodType(GoodType goodType) {
        goodTypeDAO.addGoodType(goodType);
    }
}
