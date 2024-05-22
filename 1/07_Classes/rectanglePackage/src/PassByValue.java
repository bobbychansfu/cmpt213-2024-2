import ca.cmpt213.rectangle.Rectangle;

public class PassByValue {
    public static void main(String[] args) {
        String s = "Bobby";
        System.out.println(s);
        changeName(s);
        System.out.println(s);

        Rectangle r = new Rectangle(3,4);
        System.out.println(r);
        changeRectangle(r);
        System.out.println(r);

    }
    
    public static void changeName(String s){
        s = "Steve";
    }

    public static void changeRectangle(Rectangle r){
        r.setLength(50);
        r.setWidth(60);
    }

}
