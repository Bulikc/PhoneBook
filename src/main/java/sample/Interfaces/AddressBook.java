package sample.Interfaces;

import sample.Object.Person;

/**
 * @author Bublik
 * @version 1.0
 *
 */

public interface AddressBook {
/**
 * @param Person
 */

    public void add(Person object);

    public void update(Person object);

    public void delete(Person object);
}
