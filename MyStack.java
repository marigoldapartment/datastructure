package Subhash.bhiya;
    import java.util.Arrays;

    /**Author
     * SHASHANK TRIPATHEE
     * */
    public class MyStack {
        private static Float[] myArray = new Float[10];
        /**{null,null,null,null,null,null,null,null,null,null}*/
        private static int CurrentIndex = 0;

        public static void main(String[] args) {
            push(0);push(1);push(2);push(3);push(4);push(5);
            push(6);push(7);push(8);push(9);push(10);push(11);
            push(12);pop(1);push(13);
            Arrays.stream(myArray).forEach(System.out::println);
            System.out.println(size());
        }
        /**Do not make any change above this line otherwise you will loose number*/
        public static void push(int value){
            if(CurrentIndex == myArray.length){
                myArray=Arrays.copyOf(myArray,myArray.length*2);
            }
            myArray[CurrentIndex]= Float.valueOf(value);
            CurrentIndex++;
        }

        public static void pop(int CurrentIndex){
        Float[] newArray= new Float[myArray.length-1];
        for (int i=0;i<myArray.length-1;i++){
            if(i!=CurrentIndex-1) {
                newArray[i] = myArray[i];
            }
        }
        myArray = newArray;
        CurrentIndex--;
        }


        public static int size(){
            return CurrentIndex;
        }
    }
