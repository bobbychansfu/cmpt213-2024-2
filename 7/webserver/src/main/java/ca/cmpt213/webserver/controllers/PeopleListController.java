package ca.cmpt213.webserver.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import ca.cmpt213.webserver.models.PeopleList;
import ca.cmpt213.webserver.models.Person;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class PeopleListController {

    private PeopleList peopleList;

    // @RequestMapping(value="/person",method=RequestMethod.GET)
    @GetMapping("/person")
    public List<Person> getPeople(@RequestParam(value="name",defaultValue = "steve") String name,
                                  @RequestParam(value="age", defaultValue = "20") int age) {
        System.out.println("GET /person");
        System.out.println(name);
        System.out.println(age);
        return peopleList.getPeople();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person newPerson, HttpServletResponse response) {
        System.out.println("POST /person");
        peopleList.addPerson(newPerson);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return newPerson;
    }

    @DeleteMapping("/person/{pid}")
    public Person deletePerson(@PathVariable long pid, HttpServletResponse response) {
        System.out.println("DELETE /person/" + pid);
        Person deletedPerson = peopleList.deletePerson(pid);
        return deletedPerson;
    }

    @PutMapping("/person/{pid}")
    public Person updatePerson(@PathVariable long pid, @RequestBody Person newPerson, HttpServletResponse response) {
        // TODO: edit the json file with newPerson //
        return null;
    }

    @PostConstruct
    public void init() {
        // TODO: call peopleList to initialize people //
        System.out.println("POST CONSTRUCT CODE");
    }
}