package Service;

import Dao.Vehicles;
import Model.Branch;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    public List<Vehicle> searchByType(String type){
        return Vehicles.getInstance().getVehicles(type);
    }
    public List<Vehicle> searchByBranch(Branch branch){
        Vehicles vehicles = Vehicles.getInstance();
        List<Vehicle> ans = new ArrayList<>();
        for(int id: branch.getVehicleIds()){
            ans.add(vehicles.getVehicle(id));
        }
        return ans;
    }
}
