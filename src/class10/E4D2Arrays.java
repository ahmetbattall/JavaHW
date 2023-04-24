package class10;

public class E4D2Arrays {
    public static void main(String[] args) {

        /*
        whenever we repeat code we should replace it with a loop
         */

        int [][] matrix = {
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };


        for (int j = 0; j < matrix.length; j++) {
            // getting the complete 1d array from 2d array
            int [] arr2 = matrix[j];
            for (int i = 0; i < arr2.length; i++) {
                //going over all the elements from the 1d array
                System.out.print(arr2[i] + " ");

            }
            System.out.println();
        }

















    }
}
