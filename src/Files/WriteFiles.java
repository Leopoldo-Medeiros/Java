package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFiles {
    public static void main(String[] args) {
        // Working with files
        File file = createFile("src/Files/pedro.txt");
        writeToFile(file, true);
    }

    private static void writeToFile(File file, boolean append) {
        // Applying resources
        try (
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println("Luciana");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    
//            try {
//
//                // Append: true mode is used to add content to the file, without deleting the existing content
//                FileWriter fileWriter = new FileWriter(file, true);
//                PrintWriter writer = new PrintWriter(fileWriter);
//                writer.println("Hello");
//                writer.println("Pedroca");
//                writer.println("Append Test");
//                writer.flush();
//                writer.close();
//
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
        }

        public static File createFile (String path){
            try {
                File file = new File(path);
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;

            } catch (IOException e) {
                System.out.println(e.getMessage());
                throw new IllegalStateException(e);
            }
        }
    }