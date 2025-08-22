package beyondBasics.PublicStaticVoid.Wrapper;

public class Main  {
    public static void main(String[] args) {
        // Primitive Data Types Wrapper classes
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        Integer age = 25;
        Double price = 12.5;
        var ageStr = "47";
        int a = Integer.parseInt(ageStr);
        System.out.println(a);
        System.out.println(Integer.min(20, 5));
        System.out.println(Double.isFinite(12.5));
     }
}
