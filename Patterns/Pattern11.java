//Advanced Pattern Type 02 - Rhombus Pattern

public class Pattern11 {

    public static void main(String[] args) {

        int n = 5; // Rows

        for (int i = 1; i <= n; i++) {
            //For the Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //For the Stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//  Output:
//     *****
//    *****
//   *****
//  *****
// *****