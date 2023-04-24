package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        /*
        print numbers from 100 to 1

        print even numbers from 20 to 100

        print only odd numbers from 100 to 1
        (2 diff ways)

         */
        int num1 = 100;
        System.out.println();
        while (num1 >=1){
            System.out.print(num1+ " ");
            num1--;
        }

        int num2 = 20;
        System.out.println();
        while (num2 <=100){
            if (num2 % 2 == 0){
            System.out.print(num2+ " ");}

            num2++;
        }


        int num3= 100;
        System.out.println();
        while (num3>=1){
            if (num3 % 2 !=0)
            System.out.print(num3 + " ");
            num3--;
        }














    }
}
