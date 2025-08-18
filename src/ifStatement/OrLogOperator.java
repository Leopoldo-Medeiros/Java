package ifStatement;

public class OrLogOperator {
    public static void main(String[] args) {

        String gender = "FEmale";

        if (gender.equalsIgnoreCase("Male") || gender.equals("FEmale")) {
            System.out.println("Valid gender");
        } else {
            System.out.println("Invalid gender");
        }
    }
}
