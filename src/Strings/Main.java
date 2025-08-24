package Strings;

public class Main {
    public static void main(String[] args) {

        String name = "Leopoldo";
        System.out.println(name.contains(" Medeiros"));
        System.out.println(name + " Medeiros");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("  Hello  ".trim());
        System.out.println(name.startsWith("L"));
        System.out.println(name.substring(2));
        System.out.println(name.replace(
                "L",
                "P"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        // How Strings and Stored_String Pool
        /*
        * 1. nae2 and name3 initially point to the same "Luciana" in the pool
        * 2. Reassigning name2 tp "Pedro" creates a new entry in the pool, but name3 still references to "Luciana"
        * 3. This illustrates string immutability: strings cannot be modified after creation.
        * Reassignment creates a new string
        */
        String name1 = "Luciana";
        String name2 = "Luciana";
//        name2 = "Pedro";

        // String Literal Vs String Object
        // This is an example of a String Object. This is a bad practice
        String name3 = new String( "Luciana");

        System.out.println("String equality with ==");

        // Comparing Strings ==

        // The difference between "==" and equals()
        // "==" checks for reference equality (same object in memory)
        // equals() checks for value equality (same content)
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println("String equality with ==");
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        // String Static Methods
        String number = String.valueOf(5);
        System.out.println(number);

        String format = String.format("Number %s", number);
        System.out.println(format);

        String[] names = {"Leopoldo", "Luciana", "Pedro"};
        String join = String.join(" | ", names);
        System.out.println(join);

        String str1 = new String("Pedro");
        String str2 = new String("Pedro");
        System.out.println(str1.equals(str2));
    }
}
