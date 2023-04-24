package class11;

public class E4D2Array {
    public static void main(String[] args) {


        int [][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        // print only odd numbers from this 2d array using loop

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }



    }
}
