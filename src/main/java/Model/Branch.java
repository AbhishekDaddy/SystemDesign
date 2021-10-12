package Model;

import Dao.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Branch {
    static Logger log = Logger.getLogger(Persons.class.getName());
    int id;
    List<Integer> vehicleIds;

    public Branch(int id) {
        this.id = id;
        vehicleIds = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getVehicleIds() {
        return vehicleIds;
    }

    public void setVehicleIds(List<Integer> vehicleIds) {
        this.vehicleIds = vehicleIds;
    }
    public void addVehicle(int vid){
        vehicleIds.add(vid);
    }
}
