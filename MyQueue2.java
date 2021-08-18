 import java.util.Arrays;

    /**Author
     *AKSHAY JHA
     * */
    public class MyQueue2 {
        private static Float[] myArray = new Float[10];
        /**{null,null,null,null,null,null,null,null,null,null}*/
        private static int CurrentIndex = 0;

         /*public static void main(String[] args) {
            /** First-In-First-Out*/
           /* add("0");add("1");add("2");add("3");add("4");add("5");add("6");add("7");
            add("8");add("9");add("10");add("11");add("12");poll();add("13");add("14");
            Arrays.stream(myArray).forEach(System.out::println);*/

        /**Do not make any change above this line otherwise you will loose number*/

        /**5
         * @return*/
        public static boolean poll() {
            Float[] newArray=new Float[myArray.length-1];
            for(int i=1;i<newArray.length;i++){
                newArray[i-1]=myArray[i];
            }
            myArray=newArray;
            CurrentIndex--;
            return true;
        }
        public static void add(Float value) {
            if(CurrentIndex==myArray.length)
            {
                Float[] newArray=Arrays.copyOf(myArray,myArray.length*2);
                myArray=newArray;
            }
              myArray[CurrentIndex]=value;

            CurrentIndex++;
        }

        public static int size(){
            System.out.println("your index is "+CurrentIndex);
            return 0;
        }


        public static void main(String[] args) {
            add(1F);add(2F);add(3F);add(4F);add(5F);add(6F);add(7F);add(8F);add(9F);add(10F);add(11F);add(12F);add(13F);add(14F);poll();size();
            Arrays.stream(myArray).forEach(System.out::println);
        }
    }

