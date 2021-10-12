package Service;

import Model.Payment;

public class PaymentService {

    public void pay(Payment payment){
        //0 for cash and 1 for card
        int amount = getAmount();
        if (payment.isMode()){
            payment.payViaCard(amount);
        }
        else{
            payment.payViaCash(amount);
        }

    }
    public int getAmount(){
        return 10;
    }
}
