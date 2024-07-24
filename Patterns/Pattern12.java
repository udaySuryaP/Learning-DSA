// Advanced Pattern Type 03 - Pyramid Number Pattern

public class Pattern12 {

    public static void main(String[] args) {

        int n = 5; //Row
        for (int i = 1; i <= n; i++) {
            // For Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //For Numbers - Printing the row number, to number of the row times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}

// Output:
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
