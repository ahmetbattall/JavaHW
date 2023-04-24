package class9;

public class E6Arrays {
    public static void main(String[] args) {

        /*
        Create an array and store the number 10,50,60,45,100 then print elements which are present on odd indexes
         */

        int [] numbers = {10,50,60,45,100};

        for (int i = 0; i < numbers.length ; i++) {
            if (i % 2 != 0){
                System.out.print(numbers[i] + " ");
            }

        }








    }
}
