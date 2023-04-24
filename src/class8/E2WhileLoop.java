package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        // ask the user to enter numbers if user enters any number
        // other than -1 print "Try Again" and keep on asking the user for a number
        // the moment user enters the number -1 the loop should stop

        System.out.println("Please enter a number");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        while (number != -1){
        System.out.println("Try Again");
            System.out.println("Please enter a number");
            number = scan.nextInt();



        }




















    }
}
