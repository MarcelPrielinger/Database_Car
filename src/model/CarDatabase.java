package model;

import java.util.*;

import model.MagicGenerator;
import model.Vehicle;

public class CarDatabase {

    protected HashMap<String, Vehicle> db;

    public CarDatabase(HashMap db)
    {
        MagicGenerator magicGenerator = new MagicGenerator();
        for(int i = 0; i < 10000; i++)                                  //10.000 Vehicle damit bei der Suche nicht immer 0 ms steht.
        {
        String manufacturer = magicGenerator.getRandomManufacturer();
        String licencePlate = magicGenerator.getRandomLicencePlate();
        Vehicle vehicle = new Vehicle(magicGenerator.getRandomColor(),magicGenerator.getRandomName(),manufacturer,magicGenerator.getRandomModel(manufacturer),licencePlate);
        db.put(licencePlate,vehicle);
        System.out.println(vehicle.getLicensePlate());
        }
        this.db = db;
    }

    public LinkedList<Vehicle> search(String licencePlate, boolean exact)
    {
        LinkedList<Vehicle> list = new LinkedList<Vehicle>() ;

        if(exact)
        {
                long time1 = System.nanoTime();
                list.add(db.get(licencePlate));
                if (list.getFirst() == null)
                {
                    long time2 = System.nanoTime();
                    System.out.println("it took " + (time2- time1) / 1000000 + "ms to search");
                    return null;
                }
                long time2 = System.nanoTime();
                System.out.println("it took " + (time2-time1)/1000000 +"ms to search");
        }
        else
        {
            long time1 = System.nanoTime();

            for (Vehicle v : db.values())
            {
                if(v.getLicensePlate().contains(licencePlate))
                {
                    list.add(v);
                }
            }
            long time2 = System.nanoTime();
            System.out.println("it took " + (time2-time1)/1000000 +"ms to search");
        }
        return list;
    }
}
