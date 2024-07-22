
public class Pattern01 {

    public static void main(String arg[]) {

        //outer loop for printing rows
        for (int i = 1; i <= 4; i++) {
            //inner loop for printing columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output
// *****
// *****
// *****
// *****
