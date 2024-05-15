package ca.cmpt213.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        String filename;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many friends? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("File name? ");
        filename = keyboard.nextLine();

        File file = new File("./files/"+filename);
        FileWriter fw = new FileWriter(file,true);
        PrintWriter outFile = new PrintWriter(fw);

        for (int i=1; i<=numFriends; i++) {
            friendName = keyboard.nextLine();
            outFile.println(friendName);
        }

        keyboard.close();
        outFile.close();
        System.out.println("DONE!");
    }
}
