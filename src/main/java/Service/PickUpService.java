package Service;

import Dao.Branches;
import Dao.Persons;
import Dao.Vehicles;
import Model.*;

import java.util.logging.Logger;

public class PickUpService {
    static Logger log = Logger.getLogger(PickUpService.class.getName());
    PaymentService paymentService;

    public void pickup(BookingDetail details){
        Vehicle vehicle = Vehicles.getInstance().getVehicle(details.getVehicle_id());
        Branch branch = Branches.getInstance().getBranch(details.getBranch_id());
        Person person = Persons.getInstance().getPerson(details.getCust_name());
        if (vehicle.isBooked()) {
            branch.getVehicleIds().remove(vehicle.getId());
            person.setVehicle(vehicle);
        }
        throw new RuntimeException("vehicle is Not Booked");
    }
    public void pickup(Person person, Vehicle vehicle, Branch branch, Payment pay){
        boolean status = false;
        try{
            paymentService.pay(pay);
            status = true;
        }
        catch (Exception e){
            status = false;
            log.info("Failed to get the payment still letting go the vehicle. Please pay at drop");
        }
        if (vehicle.isBooked()) {
            branch.getVehicleIds().remove(vehicle.getId());
            person.setVehicle(vehicle);
        }
        throw new RuntimeException("vehicle is Not Booked");
    }
}
