package UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello. What is your First Name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("What is your Last Name?");
        String lastName = scanner.nextLine();

        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("You are NOT old enough to drive");
        } else {
            System.out.println("You ARE old enough to drive");
        }

        scanner.close();
    }
}
