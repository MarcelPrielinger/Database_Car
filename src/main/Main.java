/*************************************
 * @author Marcel Prielinger
 * @version 1.0
 * @date 14.01.2021
 ***************************************/
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.InvocationTargetException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

            Parent root = FXMLLoader.load(getClass().getResource("/controllerView/carDatabaseV.fxml"));
            primaryStage.setTitle("CarDatabase");
            primaryStage.setScene(new Scene(root, 600, 700));
            primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}