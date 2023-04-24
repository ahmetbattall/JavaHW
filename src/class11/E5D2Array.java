package class11;

public class E5D2Array {
    public static void main(String[] args) {

        // with the help of loop count how many numbers in above array are even

        int [][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if(anInt % 2 == 0 )
                    {
                        sum++;

                }
            }
        } System.out.print(sum + " ");






    }
}
