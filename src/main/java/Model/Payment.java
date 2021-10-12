package Model;

public class Payment {
    String cardDetails;
    boolean mode;

    public boolean isMode() {
        return mode;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }

    public boolean payViaCash(int amount){
        return true;
    }
    public boolean payViaCard(int amount){
        return true;
    }
}
