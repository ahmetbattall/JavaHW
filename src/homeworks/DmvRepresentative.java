package homeworks;

import java.util.Scanner;

public class DmvRepresentative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age ?");
        int age = scan.nextInt();

        if (age >=18){
            System.out.println("Driver license issued!");
        }
        else{
            System.out.println("You should get a learners permit!");
        }








    }
}
