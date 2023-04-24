package homeworks;

import java.util.Scanner;

public class TempCity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Whats the city ? ");
        String city = scan.next();

        System.out.println("Enter temperature in fahrenheit ");
        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("The tepmerature in "+ city + " is " + celsius + " Celsius");












    }
}
