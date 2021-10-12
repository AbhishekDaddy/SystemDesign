package Model;

import Dao.Persons;

import java.util.logging.Logger;

public class Bike extends Vehicle {
    static Logger log = Logger.getLogger(Persons.class.getName());
    public Bike(int id) {
        super(id);
        this.type = "BIKE";
    }
}
