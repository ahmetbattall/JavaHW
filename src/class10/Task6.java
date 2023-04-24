package class10;

public class Task6 {
    public static void main(String[] args) {

        // Create an array of integers and calculate the sum of all elements in an array
        // From an array of integer elements find the largest number.

        int [] numbers = {10,20,30,50};

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number: " + max);












    }
}
