package class10;

public class Task4 {
    public static void main(String[] args) {

        /*
        Create an array of cars and store 6 elements into it.
        using 2 different loops print all values from the array
         */

         String[] cars = {"Bmw","Nissan","Ford","Toyota","Mercedes","Audi"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");



        }
        System.out.println();

        String[] cars1 = {"Bmw","Nissan","Ford","Toyota","Mercedes","Audi"};

        for (String s : cars1) {
            System.out.print(s + " ");

        }










    }
}
