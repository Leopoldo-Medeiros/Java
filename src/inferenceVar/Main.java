package inferenceVar;

public class Main {
    public static void main(String[] args) {

        // Type inference var keyword
        // Rule: Only use var keyword for local variables
        var name = "Luciana";
        var names = new String[]{ "Leopoldo", "Luciana", "Pedro"};
        var age = 38;
        var isAdult = true;
        var height = 1.85;

        // BREAK
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number == 3) {
                break;
            }
            System.out.println(number);
        };

        // CONTINUE
        var names2 = new String[] {
                "Leopoldo", // printed
                "Luciana", // printed
                "Allan", // found! - return is called, main method ends
                "Pedro", // never printed
                "Sara", // never printed
                "Felipe" // never printed
        };
        for (String personName : names2) {
            if (personName.startsWith("A")) {
                return;
            }
            System.out.println(personName);
        }
        System.out.println("End of main method");
    }
}
