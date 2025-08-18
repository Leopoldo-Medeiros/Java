package intro;

public class DoWhile {
    public static void main(String[] args) {

            int i = 0;
            boolean keepLooping = false;
            do {
                System.out.println("Hello " + i++);
                keepLooping = false;
            } while(keepLooping);
        }
    }
