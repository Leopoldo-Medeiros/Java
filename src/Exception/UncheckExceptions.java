package Exception;

import java.io.File;
import java.io.IOException;

public class UncheckExceptions {
    public static void main(String[] args) {

        // Exceptions
        int number = Integer.parseInt("1");
        System.out.println(number);

        for (int i = 10; i > 0; i--) {
            System.out.println(10 / i);
        }

        System.out.println("end");

        // Check exceptions
        try {
            File file = new File("/Users/lmedeiros/www/AmigosCode/src/Exception/file.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
