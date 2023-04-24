package class9;

public class E4Arrays {
    public static void main(String[] args) {

          /*
        create an array of Strings store 5 names in that array
        print all  the names from that array with the help of a for loo
        try printing with the help of a while loop as well
         */

        String [] names = {"Ahmet","Shaquille","Fred","Ferhat","Eso"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " " );

        }
        System.out.println( );

        int j = 0;
        while (j < names.length)
             {
            System.out.print(names[j] + " ");
            j++;
        }









    }
}
