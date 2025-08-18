package methods;

public class Main {

    /*
        - Access modifiers: public, private, protected
        - Optional static
        - Return Type
        - Name
        - Optional Parameters
        - Method Body
        - Optional Return Value
    */

    private static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    private static int multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    private static void printBrand(String brand) {
        System.out.println(brand.toUpperCase());
    }

    private static void isAdult(int age) {
        if (age >= 16) {
            System.out.println("You are an adult 😃");
        } else {
            System.out.println("You are not an adult 😭");
        }
    }

    public static void main(String[] args) {
        int result = add(2, 3);
        int result2 = multiply(43, 26);
        System.out.println(result);
        System.out.println(result2);
        printBrand("Leopoldo");
        printBrand("Pedro");
        printBrand("Luciana");
        isAdult(16);
        isAdult(12);
    }
}
