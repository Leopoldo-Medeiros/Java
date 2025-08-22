package beyondBasics.PublicStaticVoid.Global_Local;

public class Main {

    private static final String BRAND = "Leopoldo";
    public static final double PI = 3.14;


    public static void main(String[] args) {

        var BRAND = "Nike";
        var country = "Brazil";
        // Global and Local Variables
        System.out.println(BRAND);
        System.out.println(country);
        // Invoking a function
        foo();
    }

    private static void foo() {
        System.out.println(BRAND);
    }
}
