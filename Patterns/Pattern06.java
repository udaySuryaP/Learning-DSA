
public class Pattern06 {

    public static void main(String args[]) {

        int n = 5; //row;

        //outer loop for rows
        for (int i = 1; i <= n; i++) {
            //inner loop for column
            for (int j = 1; j <= i; j++) {
                //prints the value of j
                System.out.print(j + " ");
            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output:
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
