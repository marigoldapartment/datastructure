import java.util.Arrays;

public class MyQueue {
    private static Float[] myArray = new Float[10];
    /**{0,0,0,0,0,0,0,0,0,0}*/
    private static int CurrentIndex = 0;

    /**Do not make any change in this method otherwise you will loose number*/
    public static void main(String[] args) {
        /** First-In-First-Out*/
        add("0");add("1");add("2");add("3");add("4");add("5");add("6");add("7");
        add("8");add("9");add("10");add("11");add("12");poll();add("13");add("14");
        Arrays.stream(myArray).forEach(System.out::println);
    }
    /**Do not make any change above this line otherwise you will loose number*/

    /**5*/
    public static void poll() {

    }

    /**5*/
    public static void add(String value) {

    }

    /**5*/
    public static int size(){
        return 0;
    }


}
