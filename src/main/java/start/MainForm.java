package start;
/**
 * Created by Sergey on 31.01.2016.
 */


import Util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import org.hibernate.Session;

import java.util.Date;


public class MainForm extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        String fxmlFile = "/view/MainForm.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
//        stage.setTitle("TorgSolution");
//        stage.setScene(new Scene(root));
//        stage.show();
        /*try first start Hibernate */
//        Session session = HibernateUtil.getSessionFactory().openSession();

//        session.beginTransaction();
//
//        GoodType goodType1 = new GoodType();
//        goodType1.setName("Chocolate");
//        session.save(goodType1);
//
//        session.getTransaction().commit();

//        session.beginTransaction();
//        GoodType goodTypeFromDB = (GoodType) session.load(GoodType.class,9);
//
//        Good good = new Good();
//
//        good.setName("Корона");
//        good.setBarcode("4823061304698");
//        good.setGoodTypeId(goodTypeFromDB);
//        good.setPurchasePrice(9);
//        good.setPrice(15);
//
//        session.save(good);
//        System.out.println(goodTypeFromDB.getName());
//        session.getTransaction().commit();
//
//        HibernateUtil.shutdown();
//        System.out.println("Done");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Shop shop = new Shop();
        shop.setName("MyShop");
        shop.setId(1);

        session.save(shop);

        IncomeInvoice incomeInvoice = new IncomeInvoice();
        Date date = new Date();
        incomeInvoice.setDate(new java.sql.Timestamp (date.getTime()));
        session.save(incomeInvoice);

        GoodType goodType1 = new GoodType();
        goodType1.setName("Chocolate3");
        session.save(goodType1);

        Good good = new Good();
        good.setName("Корона4");
        good.setBarcode("4823061304693");
        good.setGoodTypeId(goodType1);
        good.setPurchasePrice(9);
        good.setPrice(15);
        session.save(good);

        IncomeCompositon incomeCompositon = new IncomeCompositon();
        incomeCompositon.setIncomeInvoice(incomeInvoice);
        incomeCompositon.setGood(good);
        session.save(incomeCompositon);

        Warehouse warehouse = new Warehouse();
        warehouse.setGood(good);
        warehouse.setShop(shop);
        warehouse.setQuantity(30);
        session.save(warehouse);

        session.getTransaction().commit();
        HibernateUtil.shutdown();


    }
}
