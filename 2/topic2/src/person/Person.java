package person;

public class Person implements Displayable {
    String name;
    int age;


    @Override
    public void display() {
        System.out.println(" (' ') - " + this.name + " " + this.age);
    }
}
