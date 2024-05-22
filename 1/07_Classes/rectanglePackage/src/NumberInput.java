import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(numbers[7]);
        Scanner in = new Scanner(System.in);
        try {

            int age = in.nextInt();
            writeNumber(age);
        }
        catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        catch (InputMismatchException ex) {
            System.out.println("no integer");
        }
        finally {
            in.close();
        }
    }

    public static void writeNumber(int num) throws FileNotFoundException {
        File file = new File("./files/age.txt");
        PrintWriter outfile= new PrintWriter(file);
        outfile.println(num);
        outfile.close();

    }
    
}
