package beyondBasics.PublicStaticVoid.Enum;

import java.util.Arrays;

public class MainEnum {

    public static void main(String[] args) {
        // Enums
        Gender male = Gender.MALE;
        System.out.println(male);

        Gender female = Gender.FEMALE;
        System.out.println(female);

        System.out.println(Gender.valueOf("FEMALE"));
        System.out.println(Arrays.toString(Gender.values()));

        System.out.println(GenderConstants.MALE);
        System.out.println(GenderConstants.FEMALE);

        // TYPE CASTING IMPLICIT
        System.out.println("Implicit Type (Widening) Casting");
        int balance = 100;
        double balanceInDouble = balance;
        System.out.println(balance);
        System.out.println(balanceInDouble);

        // EXPLICIT CASTING
        System.out.println("Explicit Type (Narrowing) Casting");
        double remainingBalance = 250.55;
        int remainingBalanceInt = (int)remainingBalance;
        System.out.println(remainingBalance);
        System.out.println(remainingBalanceInt);

    }
}
