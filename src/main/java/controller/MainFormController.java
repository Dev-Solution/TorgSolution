package controller;

import javafx.event.ActionEvent;

import model.GoodType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.GoodTypeManager;

import java.io.IOException;

/**
 * Created by Sergey on 31.01.2016.
 */

public class MainFormController {
//    @FXML
//    Button btnIncomeGoods;
    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("spring-context.xml");
//    @Autowired
//    private GoodTypeManager goodTypeManager;
    GoodTypeManager goodTypeManager = (GoodTypeManager)appContext.getBean("goodTypeManager");
    public void RealizationClick(ActionEvent actionEvent) throws IOException {
        System.out.println("blablabla");
        GoodType goodType = new GoodType();
        goodType.setName("SpringType");
        goodTypeManager.addGoodType(goodType);
        System.out.println("good");
//        try {
//
//            Stage stage = new Stage();
//            FXMLLoader loader = new FXMLLoader();
//            Parent root = loader.load(getClass().getResource("/view/RealizationForm.fxml"));
//            stage.setTitle("Реализация");
//            stage.setScene(new Scene(root));
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
//            stage.show();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
