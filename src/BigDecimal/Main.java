package BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Problem with double
        double number1 = 0.02;
        double number2 = 0.03;

        double result = number2 - number1;
        System.out.println(result);

        // BigDecimal
        // Anytime you need to store a value that represents money, to store transactions
        // Always use BigDecimal
        BigDecimal number3 = new BigDecimal("0.02");
        BigDecimal number4 = new BigDecimal("0.03");
        BigDecimal result2 = number4.subtract(number3);
        System.out.println(result2);

        // BigDecimal Methods
        BigDecimal number5 = BigDecimal.TEN;
        System.out.println(number5);
        System.out.println(number5.add(BigDecimal.ONE));
        System.out.println(number5.max(BigDecimal.ZERO));

        /*
        * System.out.println(number5.compareTo(BigDecimal.ZERO));
        * compares number5 with BigDecimal.ZERO (which is 0) and prints the result.
        * Here's what the return values mean:
        * -1 if number5 is less than 0
        * 0 if number5 is equal to 0
        * 1 if number5 is greater than 0
        * This is a common way to check the sign of a BigDecimal number.
        * Since number5 is new BigDecimal("10.5") (as seen in the output),
        * this line will print 1 because 10.5 is greater than 0.
        */
        System.out.println(number5.compareTo(BigDecimal.ZERO));

        /*
        * System.out.println(number5.compareTo(BigDecimal.TEN));
        * compares number5 with BigDecimal.TEN (which is 10) and prints the result.
        * Here's what the return values mean:
        * -1 if number5 is less than 10
        * 0 if number5 is equal to 10
        * 1 if number5 is greater than 10
        * This is a common way to check if a BigDecimal number is less than, equal to, or greater than another number.
        * Since number5 is 10.5, this line will print 1 because 10.5 is greater than 10.
        */
        System.out.println(number5.compareTo(BigDecimal.TEN));

        /*
         * System.out.println(number5.compareTo(new BigDecimal("11")));
         * compares number5 with new BigDecimal("11") and prints the result.
         * Here's what the return values mean:
         * -1 if number5 is less than 11
         * 0 if number5 is equal to 11
         * 1 if number5 is greater than 11
         * This is a common way to compare two BigDecimal numbers.
         * Since number5 is 10.5, this line will print -1 because 10.5 is less than 11.
         */
        System.out.println(number5.compareTo(new BigDecimal("11")));
    }
}
