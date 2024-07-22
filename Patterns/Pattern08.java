
public class Pattern08 {

    public static void main(String args[]) {

        int n = 5; //rows
        int number = 1; //number to be printed

        //outer loop for row
        for (int i = 1; i <= n; i++) {
            //inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                //to increment the number for every interation
                number++;

            }
            //At the end of the inner loop, the cursor moves to the next line. 
            System.out.println();
        }
    }
}

// Output:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

// Floyd's Triangle
