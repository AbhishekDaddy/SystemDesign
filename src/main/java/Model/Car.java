package Model;

import Dao.Persons;

import java.util.logging.Logger;

public class Car extends Vehicle {
    static Logger log = Logger.getLogger(Persons.class.getName());
    public Car(int id) {
        super(id);
        this.type = "CAR";
    }
}
