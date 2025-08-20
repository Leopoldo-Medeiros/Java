package beyondBasics.PublicStaticVoid;
import java.awt.*;
import java.util.Arrays;

public class Main {

    public static final String NAME = "Pedro";
    public static void main(String[] args) {
        System.out.println("Program was given");
        if(args.length > 0) {
            System.out.println("The following arguments");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("No arguments were given");
        }

        // BREAK
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number == 3) {
                break;
            }
            System.out.println(number);
        }

        // CONTINUE
        var names = new String[]{
                "Leopoldo",
                "Andrew",
                "Luciana",
                "Allan",
                "Pedro",
                "Sara",
                "Felipe"
        };

        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
        System.out.println("End of program");

        // FINAL KEYWORD
        final var name = "Pedro";
//        name = "Pedro";
        System.out.println(NAME);
        final Point p = new Point();
        p.y = 10;
        p.y = 90;
        System.out.println(Math.PI);
    }
}
