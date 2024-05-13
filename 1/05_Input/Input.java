import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String fname;
        String lname;
        int age;
        String phone;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            fname = input.next();
            lname = input.next();
            System.out.print("Enter your age: ");
            age = input.nextInt();
            input.nextLine(); // consuming the buffer
            System.out.print("Enter your phone number: ");
            phone = input.nextLine();
            input.close();
            System.out.println("\nFirst Name: " + fname + "\nLast Name: " + lname + "\nAge: " + age + "\nPhone: " + phone);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
