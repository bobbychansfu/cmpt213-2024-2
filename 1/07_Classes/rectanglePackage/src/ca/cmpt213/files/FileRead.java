package ca.cmpt213.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "./files/friends.txt";

        File file = new File(filename);

        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            System.out.println(inputFile.nextLine());
        }

    }
}
