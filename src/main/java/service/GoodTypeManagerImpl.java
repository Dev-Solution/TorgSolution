package service;


import dao.GoodTypeDAO;
import model.GoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Sergey on 17.02.2016.
 */
@Service

public class GoodTypeManagerImpl implements GoodTypeManager {

    @Autowired
    private GoodTypeDAO goodTypeDAO;

    @Override
    @Transactional
    public void addGoodType(GoodType goodType) {
        goodTypeDAO.addGoodType(goodType);
    }
}
