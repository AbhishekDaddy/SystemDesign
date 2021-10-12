package Model;

import Dao.Persons;

import java.util.logging.Logger;

public abstract class Vehicle {
    static Logger log = Logger.getLogger(Persons.class.getName());

    String type;
    int id;
    boolean isBooked;
    int branch_id;


    public Vehicle(int id, int b) {
        this.id = id;
        this.branch_id = b;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
