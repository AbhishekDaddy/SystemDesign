package Service;

import Dao.Persons;
import Model.BookingDetail;
import Model.Payment;
import Model.Person;
import Model.Vehicle;

import java.util.logging.Logger;

public class BookingService {
    static Logger log = Logger.getLogger(BookingService.class.getName());
    AdminService adminService;
    PaymentService paymentService;

    public BookingDetail book(Vehicle vehicle, Person person){
        if(!canBook(person)){
            //redirect to AdminService to add accessLevel
            adminService.addCustomer(person);
            log.info("Registered as a customer");
        }
        vehicle.setBooked(true);
        log.info("Succefully Booked a Vehicle");
        //return a dummy info
        //String vehicle_id, String branch_id, Boolean paymentStatus, String cust_name
        return new BookingDetail(Integer.toString(vehicle.getId()), Integer.toString(vehicle.getBranch_id()), false, person.getName());

    }
    public BookingDetail book(Vehicle vehicle, Person person, Payment payment){
        boolean status = false;
        try{
            paymentService.pay(payment);
            status = true;
        }
        catch (Exception e){
            status = false;
            log.info("Failed to get the payment still booking the vehicle. Please pay at pickup/drop");
        }
        BookingDetail ticket = book(vehicle,person);
        ticket.setPaymentStatus(status);
        return ticket;
    }
    private boolean canBook(Person person){
        return person.getAccount().getLevel() > 0;
    }

}
