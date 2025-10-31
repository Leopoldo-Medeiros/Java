package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        // Classes
        Cat pedro = new Cat();
        pedro.setName("Pedro");
        pedro.meow();
        System.out.println(pedro.getNme());

        Cat star = new Cat();
        star.setName("Star");
        star.meow();
        System.out.println(star.getNme() );
    }
}
