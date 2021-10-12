package Model;

import java.util.logging.Logger;

public class Person {

    static Logger log = java.util.logging.Logger.getLogger(Person.class.getName());

    private int id;
    String name;
    Account account;
    Vehicle vehicle;

    public Person(int id) {

        this.id = id;
        account = new Account(0);
    }
    public Person(int id, Account account) {
        this.id = id;
        this.account = account;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isAdmin() {
        return account.getLevel() == 3;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
