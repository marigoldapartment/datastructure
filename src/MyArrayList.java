import java.util.Arrays;

/**7:30 to 9:30
 *
 */
/**Author
 *
 * */
public class MyArrayList {
    private static Float[] myArray = new Float[10];
    /**{null,null,null,null,null,null,null,null,null,null}*/
    private static int CurrentIndex = 0;


    public static void main(String[] arg) {
        add(0);add(1);add(2);add(3);add(4);add(5);add(6);add(7);add(8);add(9);
        add(10); add(11);add(12); add(13);add(14); add(15);add(16); add(17);add(18); add(19);add(20); add(21);
        add(22);
        remove(3);
        add(23);
        System.out.println(get(3));
        Arrays.stream(myArray).forEach(System.out::println);
    }
    /**Do not make any change above this line otherwise you will loose number*/

    /**2.5 and 5*/
    public static int get(int index){
        return 0;
    }

    /**10*/
    public static void remove(int index){

    }

    /**5*/
    public static void add(float value) {

    }

    /**2.5 and 5*/
    public static int size(){
        return 0;
    }
}
