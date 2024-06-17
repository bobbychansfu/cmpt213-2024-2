package sharedreference;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthday; // mutable

    // Constructor
    public Person(String n, int a, Date bd)
    {
        age = a;
        name = n;
        birthday = (Date) bd.clone();
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public Date getBirthday() {
        return (Date) this.birthday.clone();
    }
}
