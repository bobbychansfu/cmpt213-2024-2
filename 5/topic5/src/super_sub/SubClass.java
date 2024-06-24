package super_sub;

public class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("Subclass");
    }

    public SubClass(int init) {
        super(init);
    }

}
