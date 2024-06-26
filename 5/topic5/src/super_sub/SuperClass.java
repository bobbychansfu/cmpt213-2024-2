package super_sub;

public class SuperClass {
    public SuperClass(){
        System.out.println("SUPERCLASS constructor, no-args");
    }
    public SuperClass(int arg){
        System.out.println("SUPERCLASS constructor, arg: "+ arg);
        showValues(5);
    }


    public void showValues(int arg) {
        System.out.println("showValue() - SUPERCLASS int arg " + arg);
    }
    final public void showValues(String arg) {
        System.out.println("showValue() - SUPERCLASS Str arg " + arg);
    }


}
