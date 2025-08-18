package ifStatement;

public class IsNot {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);

        // Bad practice
//        boolean isAdult1 = false;
//        if (isAdult1 == true) {
//        }

        // Good practice
        boolean isAdult2 = false;
        if (!isAdult2) {
            System.out.println("Not Adult =( ");
        }


    }
}
