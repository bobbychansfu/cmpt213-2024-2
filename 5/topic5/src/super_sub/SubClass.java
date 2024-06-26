package super_sub;

public class SubClass extends SuperClass {
    public SubClass() {
        this(10);
        System.out.println("Subclass");
    }

    public SubClass(int init) {
        super(init);
        System.out.println("Subclass in Arg: " + init);
    }

    public void showSuperValues(int arg) {
        super.showValues(arg);
    }

    @Override
    public void showValues(int arg) {
        System.out.println("showValue() - SUBCLASS int arg " + arg);
    }
    public void showValue(double d) {
        System.out.println("showValue() - SUBCLASS int arg " + d);
    }


}
