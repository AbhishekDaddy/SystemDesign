package Model;

public class BookingDetail {

    String vehicle_id;
    String branch_id;
    Boolean paymentStatus;
    String cust_name;

    public BookingDetail(String vehicle_id, String branch_id, Boolean paymentStatus, String cust_name) {
        this.vehicle_id = vehicle_id;
        this.branch_id = branch_id;
        this.paymentStatus = paymentStatus;
        this.cust_name = cust_name;
    }

    @Override
    public String toString() {
        String ans = "Vehicle: " + vehicle_id + "\r\n"+ "Branch: " + branch_id + "\r\n"+ "Customer Name: " + cust_name + "\r\n";
        if (paymentStatus)
            ans += "PAID";
        else{
            ans += "NOT PAID";
        }
        return ans;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getVehicle_id() {
        return Integer.getInteger(vehicle_id);
    }

    public int getBranch_id() {
        return Integer.getInteger(branch_id);
    }

    public int getCust_name() {
        return Integer.getInteger(cust_name);
    }
}
