import ca.cmpt213.dice.Die;
import ca.cmpt213.rectangle.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,15);
        Rectangle r2 = new Rectangle(5,40);
//        System.out.println(r1);
//        System.out.println(r2);

//        if (r1.equals(r2)) {
//            System.out.println("EQUALS!");
//        }
//        System.out.println(Rectangle.getTotalRectangles());

//        Random random = new Random();
//        random.nextInt(1,100);

        List<Rectangle> boxes = new ArrayList<>();
        boxes.add(r1);
        boxes.add(r2);

        for (Rectangle rec: boxes){
            System.out.println(rec);
        }

        Die d = new Die(3);
    }

}