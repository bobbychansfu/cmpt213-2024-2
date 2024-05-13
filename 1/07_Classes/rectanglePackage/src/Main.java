import ca.cmpt213.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,15);
        Rectangle r2 = new Rectangle(5,40);
        System.out.println(r1);
        System.out.println(r2);
        if (r1.equals(r2)) {
            System.out.println("EQUALS!");
        }
        System.out.println(Rectangle.getTotalRectangles());
    }
}