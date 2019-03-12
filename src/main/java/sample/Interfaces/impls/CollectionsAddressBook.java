package sample.Interfaces.impls;

import sample.Interfaces.AddressBook;
import sample.Object.Person;

import java.util.ArrayList;

public class CollectionsAddressBook implements AddressBook {


    private ArrayList<Person> personArrayList=new ArrayList<Person>();


    public void add(Person object) {
        personArrayList.add(object);
    }

    public void update(Person object) {

    }

    public void delete(Person object) {
        personArrayList.remove(object);
    }

    public ArrayList<Person> getPersonList(){
        return personArrayList;
    }
}
