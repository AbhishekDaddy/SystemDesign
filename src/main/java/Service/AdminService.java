package Service;

import Dao.Persons;
import Dao.Vehicles;
import Model.Branch;
import Model.Person;
import Model.Vehicle;
import Model.ZoomCar;

public class AdminService {
    private ZoomCar zoomCar;
    public void addBranch(Branch branch){
        zoomCar.addBranch(branch.getId());
    }
    public void addVehicle(Vehicle vehicle, Branch branch){
        branch.addVehicle(vehicle.getId());
        Vehicles.getInstance().addVehicle(vehicle);
    }
    public void addCustomer(Person person){
        person.getAccount().setLevel(1);
        Persons.getInstance().addPerson(person);
    }
    public void addAdmin(Person person){
        person.getAccount().setLevel(3);
        Persons.getInstance().addPerson(person);
    }
}
