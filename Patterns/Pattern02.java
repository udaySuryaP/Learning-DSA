
public class Pattern02 {

    public static void main(String args[]) {

        int n = 4; //rows
        int m = 5; //columns

        //outer loop for printing rows
        for (int i = 1; i <= n; i++) {
            //inner loop for printing rows
            for (int j = 1; j <= m; j++) {
                //condition for the white space and star
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output
// *****
// *   *
// *   *
// *****
