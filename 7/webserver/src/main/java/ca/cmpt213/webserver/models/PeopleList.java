package ca.cmpt213.webserver.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PeopleList {

    private List<Person> people = new ArrayList<>();
    
    public List<Person> getPeople() {
        // TODO: read from the json file //
        return people;
    }

    public void addPerson(Person newPerson) {
        // TODO: add person to json file //
        people.add(newPerson);

    }

    public Person deletePerson(long pid) {
        // TODO: delete person pid from json file //
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getPid() == pid) {
                Person person = people.get(i);
                people.remove(i);
                return person;
            }
        }
        return null;
    }
}
