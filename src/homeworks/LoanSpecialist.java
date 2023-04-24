package homeworks;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the amount of the loan ?");
        int loan = scan.nextInt();

        if (loan <= 200000){
            System.out.println("You can get loan");
        }
        else {
            System.out.println("You can not get a loan");
        }







    }
}
