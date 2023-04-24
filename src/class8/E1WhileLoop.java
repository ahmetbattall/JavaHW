package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // ask the user for starting and ending number to print all whole numbers from start to end

        System.out.println("Please enter a starting  number");
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        System.out.println("Please enter a ending number");
        int end = scan.nextInt();
        System.out.println("Please enter the step");
        int step = scan.nextInt();


        int number = start;
        while (number<=end){
            System.out.print(number + " ");
            number= number+step;
        }










    }
}
