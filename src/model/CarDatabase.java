package model;

import java.util.*;

import model.MagicGenerator;
import model.Vehicle;

public class CarDatabase {

    protected HashMap<String, Vehicle> db;

    public CarDatabase(HashMap db)
    {
        MagicGenerator magicGenerator = new MagicGenerator();
        for(int i = 0; i < 1000; i++)
        {
        String manufacturer = magicGenerator.getRandomManufacturer();
        String licencePlate = magicGenerator.getRandomLicencePlate();
        Vehicle vehicle = new Vehicle(magicGenerator.getRandomColor(),magicGenerator.getRandomName(),manufacturer,magicGenerator.getRandomModel(manufacturer),licencePlate);
        db.put(licencePlate,vehicle);
        System.out.println(vehicle.toString());
        }
        this.db = db;
    }

    public List<Vehicle> search(String licencePlate, boolean exact)
    {
        List<Vehicle> list = new List<Vehicle>() {
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
            public Iterator<Vehicle> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Vehicle vehicle) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Vehicle> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Vehicle> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Vehicle get(int i) {
                return null;
            }

            @Override
            public Vehicle set(int i, Vehicle vehicle) {
                return null;
            }

            @Override
            public void add(int i, Vehicle vehicle) {

            }

            @Override
            public Vehicle remove(int i) {
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
            public ListIterator<Vehicle> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Vehicle> listIterator(int i) {
                return null;
            }

            @Override
            public List<Vehicle> subList(int i, int i1) {
                return null;
            }
        };

        if(exact)
        {
            list.add(db.get(licencePlate));
        }
        else
        {
            if(db.containsKey(licencePlate))
            {
                list.add(db.get(licencePlate));
            }
        }
        return list;
    }
}
