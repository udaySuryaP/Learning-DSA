
public class Pattern04 {

    public static void main(String args[]) {

        int n = 5; //rows

        //outer loop for printing rows
        for (int i = n; i >= 1; i--) {
            //inner loop for printing rows
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //At the end of the inner loop, the cursor moves to the next line. 
        System.out.println();
    }
}

// Output
// *****
// ****
// ***
// **
// *
