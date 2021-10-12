package Model;

public class Account {

    String username;
    String Password;
    int level = 0;
    // level = 0 : guest
    // level = 1: Customer
    // level = 2: ParkingAttendant
    // level = 3: Admin


    public Account(int level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
