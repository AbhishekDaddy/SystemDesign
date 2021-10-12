package Dao;

import Model.Branch;
import Model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Branches {
    static Logger log = Logger.getLogger(Branches.class.getName());
    static Branches branches = null;
    Map<Integer, Branch> branchMap;

    public static Branches getInstance(){
        if (branches == null)
            branches = new Branches();
        return branches;
    }

    private Branches() {
        this.branchMap = new HashMap<Integer, Branch>();
        log.info("Branch DB initialisze");
    }
    public void addBranch(Branch branch){
        branchMap.put(branch.getId(), branch);
    }
    public Branch getBranch(int id){
        return branchMap.get(id);
    }
}
