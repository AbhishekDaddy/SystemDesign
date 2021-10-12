package Model;

import Dao.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ZoomCar {
    static Logger log = Logger.getLogger(ZoomCar.class.getName());
    int id;
    List<Integer> branchIds;

    public ZoomCar(int id) {
        this.id = id;
        branchIds = new ArrayList<>();
    }
    public void addBranch(int branch_id){
        branchIds.add(branch_id);
    }
}
