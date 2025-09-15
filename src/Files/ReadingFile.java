package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Files.WriteFiles.createFile;

public class ReadingFile {
    public static void main(String[] args) {

        File file = createFile("src/Files/lucy.txt");
//        writeToFile(file, false);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(File file, boolean b) {
    }
}
