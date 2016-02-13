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
import model.GoodType;
import org.hibernate.Session;

public class MainForm extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/view/MainForm.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        stage.setTitle("TorgSolution");
        stage.setScene(new Scene(root));
        stage.show();
        /*try first start Hibernate */
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        GoodType goodType1 = new GoodType();
        goodType1.setName("Chocolate");
        session.save(goodType1);

        session.getTransaction().commit();

        session.beginTransaction();
        GoodType goodTypeFromDB = (GoodType) session.load(GoodType.class,goodType1.getId());
        System.out.println(goodTypeFromDB.getName());
        session.getTransaction().commit();

        HibernateUtil.shutdown();
        System.out.println("Done");
    }
}
