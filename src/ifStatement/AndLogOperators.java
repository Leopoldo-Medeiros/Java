package ifStatement;

public class AndLogOperators {
    public static void main(String[] args) {
        int age = 4;
        boolean isAdult = age >= 16;

        if(isAdult) {
            System.out.println("is adult");
        } else if (age == 0) {
            System.out.println("is a baby");
        } else if(age > 0 && age <= 3 && false) {
            System.out.println("is a toddler");
        } else {
            System.out.println("is NOT adult");
        }
    }
}
