package class9;

public class E5Arrays {
    public static void main(String[] args) {

        /*
            Write a loop that starts from 0 and it goes till the number 5 and print
            only the even numbers

           Create an array of chars and you have to print all the chars on even indexes

         */

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        char [] chars = {'A','B','C','D','E'};

        for (int i = 0; i < chars.length ; i++) {
            if (i % 2 == 0){
                System.out.print(chars[i] + " ");
            }

        }








    }
}
