package controllerView;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
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
    private static Button btn_search;

    @FXML
    private static TextField txt_search;

    @FXML
    private static Button btn_search_exact;

    @FXML
    private static ListView list_vehicle;

    private static HashMap<String, Vehicle> db = new HashMap<>();
    private static CarDatabase carDatabase = new CarDatabase(db);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void search_exact(ActionEvent event) {
        event.consume();
        ObservableList observableList = new ObservableList() {
            @Override
            public void addListener(ListChangeListener listChangeListener) {

            }

            @Override
            public void removeListener(ListChangeListener listChangeListener) {

            }

            @Override
            public boolean addAll(Object[] objects) {
                return false;
            }

            @Override
            public boolean setAll(Object[] objects) {
                return false;
            }

            @Override
            public boolean setAll(Collection collection) {
                return false;
            }

            @Override
            public boolean removeAll(Object[] objects) {
                return false;
            }

            @Override
            public boolean retainAll(Object[] objects) {
                return false;
            }

            @Override
            public void remove(int i, int i1) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] objects) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int i) {
                return null;
            }

            @Override
            public Object set(int i, Object o) {
                return null;
            }

            @Override
            public void add(int i, Object o) {

            }

            @Override
            public Object remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int i) {
                return null;
            }

            @Override
            public List subList(int i, int i1) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener invalidationListener) {

            }

            @Override
            public void removeListener(InvalidationListener invalidationListener) {

            }
        };
        observableList.add(carDatabase.search(txt_search.getText(),true));
        list_vehicle.setItems(observableList);
    }
}