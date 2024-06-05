import person.Person;

import java.util.*;

public class SortPerson {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        populatePeople(people);
        displayPeople(people);

        java.util.Collections.sort(people);
        System.out.println("Comparable:");
        displayPeople(people);

        sortPeopleByAge(people);
        System.out.println("Comparator <age>");
        displayPeople(people);
    }

    private static void sortPeopleByAge(ArrayList<Person> people) {
        java.util.Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void populatePeople(ArrayList<Person> people) {
        Random rand = new Random();
        List<String> names = Arrays.asList("David", "Bobby", "Alice", "Gail", "Homer",
                "Izzie", "Fred", "Egbert", "Jacob", "Catherine");

        for (int i = 0; i < 10; i++) {
            String name = names.get(i);
            int age = Math.abs(rand.nextInt(100));
            Person p = new Person(name, age);
            people.add(p);
        }
    }

    private static void displayPeople(ArrayList<Person> people) {
        System.out.println("List of people:");
        for (Person p: people) {
            p.display();
        }
    }
}
