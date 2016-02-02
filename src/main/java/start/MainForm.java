package start; /**
 * Created by Sergey on 31.01.2016.
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainForm extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/view/MainForm.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource(fxmlFile));
        stage.setTitle("TorgSolution");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
