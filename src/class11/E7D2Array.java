package class11;

public class E7D2Array {
    public static void main(String[] args) {

        // with the help of loop count how many numbers in above array are even

        boolean [][] arr = {
                { true,false,true,true,false},
                {true,false,false,false,false}
        };

        // with the help of the loop you have to count how many times we have true in above 2d array

        int sum = 0;

        for (boolean[] booleans : arr) {
            for (boolean aBoolean : booleans) {
                if (aBoolean ){
                    sum++;

                }
            }

        } System.out.println(sum);









    }
}
