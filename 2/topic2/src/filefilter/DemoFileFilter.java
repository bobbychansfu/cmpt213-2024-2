package filefilter;

import java.io.File;
import java.io.FileFilter;

public class DemoFileFilter {
    public static void main(String[] args) {
        demoClassFilter();

    }

    private static void dumpFiles(File[] files){
        for (File subFile : files){
            System.out.println("file: " + subFile.getAbsolutePath());
        }
    }

    private static void demoClassFilter() {

        File folder = new File("./files");
        File[] fileList = folder.listFiles();

        dumpFiles(fileList);
    }

    private static void demoInnerFilter() {

    }

    private static void demoAnonFilter() {  

    }

    private static void demoLambdaFilter() {  

    }
}
