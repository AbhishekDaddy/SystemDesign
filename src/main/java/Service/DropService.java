package Service;

import Model.BookingDetail;
import Model.Payment;

import java.util.logging.Logger;

public class DropService {
    static Logger log = Logger.getLogger(DropService.class.getName());
    PaymentService paymentService;

    public void drop(BookingDetail details, Payment payment){
        if (!details.getPaymentStatus()){
            boolean status = false;
            try{
                paymentService.pay(payment);
                status = true;
            }
            catch (Exception e){
                status = false;
                log.info("Drop failed");
                throw new RuntimeException("Payment Failed. Pleass tye different mode");
            }
        }

    }
}
