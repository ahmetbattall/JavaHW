package class11;

public class E2D2Array {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halima","Alina","Semir"}
        };
        for (String[] nameArr : names2DArray) {
            for (String s : nameArr) {
                System.out.print(s + " ");

            }


        }







    }
}
