//Advanced Pattern Type 01

public class Pattern10 {

    public static void main(String[] args) {

        int n = 5; //Row

        //Upper half
        for (int i = 1; i <= n; i++) {
            //First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }

        //Lower half
        for (int i = n; i >=1; i--) {
            //First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }

    }
}


// Output:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *