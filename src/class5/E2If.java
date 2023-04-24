package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        // Below code helps us get any type of data from the console
        Scanner input = new Scanner(System.in);

        // print the text inside the "" in the console
        System.out.println("Is it time for break (true / false) ");


        //boolean isBreak => we are creating a variable of type boolean
        boolean isBreak = input.nextBoolean();
        if (isBreak) {
            System.out.println("Let's have a break ");
        }
        else {
            System.out.println("Lets continue the class");
        }







    }
}
