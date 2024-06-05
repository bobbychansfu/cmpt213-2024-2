package filefilter;

import java.io.File;
import java.io.FileFilter;

public class DemoFileFilter {
    public static void main(String[] args) {
        demoAnonFilter();

    }

    private static void dumpFiles(File[] files){
        for (File subFile : files){
            System.out.println("file: " + subFile.getAbsolutePath());
        }
    }

    private static void demoClassFilter() {
        File folder = new File("./files");

        FileFilter filter = new TxtFilter();
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
    }

    private static void demoInnerFilter() {
        File folder = new File("./files");

        class TxtInnerFilter implements FileFilter {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        }
        FileFilter filter = new TxtInnerFilter();
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
    }

    private static void demoAnonFilter() {
        File folder = new File("./files");

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        };
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
    }

    private static void demoLambdaFilter() {
        File folder = new File("./files");

        File[] fileList = folder.listFiles(
                (File file) -> file.getName().endsWith(".txt")
        );

        dumpFiles(fileList);
    }
}
