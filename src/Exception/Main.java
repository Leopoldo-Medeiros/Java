package Exception;

public class Main {
    public static void main(String[] args) {
        // Exception
        System.out.println(divide(10, 0));

        try {
            int number = Integer.parseInt("1");
            System.out.println(number);

            for (int i = 10; i > 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("End");

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Catch all exceptions");
            System.out.println(e.getMessage());
//            e.printStackTrace();
            // e.printStackTrace(); -> print the stack trace.
            // Basically, what it is doing is printing the stack trace of the exception.

        } finally {
            System.out.println("Finally always runs");
        }
    }

    // Exception
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new MyUnCheckedException("Cannot divide by zero ");
        }
        return a / b;
    }
}
