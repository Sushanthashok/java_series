public class StarPattern {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {     // Controls number of rows

            for (int j = 1; j <= i; j++) { // Prints stars in each row
                System.out.print("*");
            }

            System.out.println();          // Moves to next line
        }
    }
}
