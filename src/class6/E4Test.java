package class6;

import java.util.Scanner;

public class E4Test {
    public static void main(String[] args) {

        System.out.println("Please enter your height");
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();

        if (height < 60 ){
            System.out.println( "You are short");
        }
        else if(height >= 60 && height <= 72){
            System.out.println("You are medium");
        }
        else {
            System.out.println("You are tall");
        }




    }
}
