package dao;

import model.GoodType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Sergey on 17.02.2016.
 */
@Repository
public class GoodTypeDAOImpl implements GoodTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addGoodType(GoodType goodType) {
        sessionFactory.getCurrentSession().save(goodType);
    }
}
