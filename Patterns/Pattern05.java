
public class Pattern05 {

    public static void main(String args[]) {

        int n = 4; //rows

        //outer loop for printing rows
        for (int i = 1; i <= n; i++) {//outer
            //inner loop for printing white spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //inner loop for printing star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output
//    *
//   **
//  ***
// ****
