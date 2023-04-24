package class9;

public class E11Arrays {
    public static void main(String[] args) {

        /*
        There are two ways of creating arrays
        new int[5] => create an array of int with size 5
         */

        int [] numbers = new int[5];
        numbers[0]=50;
        numbers[1]=40;
        numbers[2]=30;
        numbers[3]=20;
        numbers[4]=10;


        for (int number : numbers) {
            System.out.print(number + " ");
        }








    }
}
