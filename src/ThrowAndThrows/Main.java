package ThrowAndThrows;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            felipe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void felipe() throws Exception {
        luciana();
    }

    static void luciana() throws Exception {
        leo();
    }

    static void leo() throws Exception {
        divide(10, 0);
    }

    public static double divide (int a, int b) throws Exception {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
