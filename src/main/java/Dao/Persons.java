package Dao;

import Model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Persons {
    //Database to store all Persons
    //including admins & Customer

    static Logger log = Logger.getLogger(Persons.class.getName());
    static Persons persons = null;
    Map<Integer, Person> personMap;

    public static Persons getInstance(){
        if (persons == null)
            persons = new Persons();
        return persons;
    }

    private Persons() {
        log.info("Person DB intialized");
        personMap = new HashMap<Integer, Person>();
    }

    public void addPerson(Person person){
        personMap.put(person.getId(), person);
        log.info(person.getName() + " is added to the DB");
    }
    public void removeCustomer(Person person){
        personMap.remove(person.getId());
        log.info(person.getName() + " is removed from the DB");
    }
    public Person getPerson(int id){
        return personMap.get(id);
    }
}
