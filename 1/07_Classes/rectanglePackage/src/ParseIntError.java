
public class ParseIntError {
    public static void main(String[] args) {
        String str = "12";
        int number;
        try {
            number = Integer.parseInt(str);
        }
        catch (NumberFormatException ex) {
            System.out.println("Conversion Ex: " +
                ex.getMessage());
        }
        finally {
            System.out.println("DONE!");
        }
    }
}
