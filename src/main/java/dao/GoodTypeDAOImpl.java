package dao;

import model.GoodType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import util.CustomHibernateDaoSupport;

/**
 * Created by Sergey on 17.02.2016.
 */
@Repository("goodTypeDAO")
public class GoodTypeDAOImpl extends CustomHibernateDaoSupport implements GoodTypeDAO {

//    @Autowired
//    private SessionFactory sessionFactory;

    @Override
    public void addGoodType(GoodType goodType) {
        getHibernateTemplate().save(goodType);
    }
}
