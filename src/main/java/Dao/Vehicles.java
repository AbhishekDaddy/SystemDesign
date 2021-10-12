package Dao;

import Model.Bike;
import Model.Car;
import Model.Vehicle;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Vehicles {

    static Logger log = Logger.getLogger(Vehicles.class.getName());
    static Vehicles vehicles = null;
    Map<Integer, Bike> bikeMap;
    Map<Integer, Car> carMap;


    public static Vehicles getInstance(){
        if (vehicles == null)
            vehicles = new Vehicles();
        return vehicles;
    }

    private Vehicles() {
        log.info("Vehicles DB intialized");
        bikeMap = new HashMap<Integer, Bike>();
        carMap = new HashMap<Integer, Car>();
    }

    public void addVehicle(Vehicle vehicle){
        if (vehicle.getType().equals("BIKE")){
            bikeMap.put(vehicle.getId(), (Bike)vehicle);
        }
        else {
            carMap.put(vehicle.getId(), (Car)vehicle);
        }
        String v = vehicle.getType();
        log.info( v +" is added to the DB");
    }
    public void removeCustomer(Vehicle vehicle){
        if (vehicle.getType().equals("BIKE")){
            bikeMap.remove(vehicle.getId(), (Bike)vehicle);
        }
        else {
            carMap.remove(vehicle.getId(), (Car)vehicle);
        }
        String v = vehicle.getType();
        log.info( v + " is removed from the DB");
    }
    public List<Vehicle> getVehicles(String type){
        List<Vehicle> ans = new ArrayList<>();
        if (type == "BIKE"){
            for(Map.Entry<Integer, Bike> entry: bikeMap.entrySet()) {
                ans.add(entry.getValue());
            }
        }
        else{
            for(Map.Entry<Integer, Car> entry: carMap.entrySet()) {
                ans.add(entry.getValue());
            }
        }
        return ans;
    }
    public Vehicle getVehicle(int id){
        if (bikeMap.containsKey(id)){
            return bikeMap.get(id);
        }
        return carMap.get(id);
    }

}
