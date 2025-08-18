package intro;

public class WhileLoop {
    /**
     * Example of a while loop that prints "Hello + <i>" once,
     * where <i> is the loop counter.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        int i = 0;
        boolean keepLooping = true;
        while(keepLooping) {
            System.out.println("Hello " + i++);
            keepLooping = false;

        }
    }
}
