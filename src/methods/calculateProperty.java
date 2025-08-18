package methods;

public class calculateProperty {

    public static void main(String[] args) {
        double yield = calculatePropertyYield(
                1_450, 250_000
        );
        System.out.println(yield);
    }

    public static double calculatePropertyYield(
            double rent, double propertyValue
    ) {
        double yearlyRent = rent * 12;
        double yield = (yearlyRent / propertyValue) * 100;
        return yield;
    }
}
