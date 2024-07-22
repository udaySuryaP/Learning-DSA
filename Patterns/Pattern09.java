
public class Pattern09 {

    public static void main(String args[]) {

        int n = 5; //row
        //outer loop for rows
        for (int i = 1; i <= n; i++) {
            //inner loop for column
            for (int j = 1; j <= i; j++) {
                //initialized a variable sum to get sum of i and j
                int sum = i + j;
                //if sum is an odd number, prints 1
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    //if sum is an odd number, prints 0
                    System.out.print("0 ");
                }
            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output:
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
