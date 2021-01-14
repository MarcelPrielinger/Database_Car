package controllerView;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.CarDatabase;
import model.Vehicle;

import java.net.URL;
import java.util.*;

public class CarDatabaseC implements Initializable {

    @FXML
    private  Button btn_search;

    @FXML
    private  TextField txt_search;

    @FXML
    private  Button btn_search_exact;

    @FXML
    private  ListView list_vehicle;

    private static HashMap<String, Vehicle> db = new HashMap<>();
    private static CarDatabase carDatabase = new CarDatabase(db);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void search_exact(ActionEvent event) {

        LinkedList<Vehicle> linkedList = carDatabase.search(txt_search.getText(),true);
        LinkedList<String> strings = new LinkedList<>();
        if(linkedList != null)
        {
            strings.add(linkedList.getFirst().toString());
        }
        list_vehicle.setItems(FXCollections.observableList(strings));
    }

    public void search(ActionEvent event)
    {
        LinkedList<Vehicle> vehicles = carDatabase.search(txt_search.getText(), false);
        list_vehicle.setItems(FXCollections.observableArrayList(vehicles));
    }
}