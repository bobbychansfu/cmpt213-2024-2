package person;

public class Person implements Displayable, Comparable<Person> {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println(" (' (..) ') < (" + this.name + " " + this.age + ")");
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.getName());
    }
}
