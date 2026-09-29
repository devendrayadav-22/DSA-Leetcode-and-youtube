//* * * * *
//* * * *
//* * *
//* *
//*

public class ReverseRightHalfPyaramid {
    static void main(){
        // n = 5 ( total rows), column = 5,
        // analyse relation - row 1 -> col 5 ( 5 *), row 2 -> col 4 ( 4 *)
        //formula - start = n - row
        int n = 9;
        for (int row = 0; row < n ; row++) {
            for (int col = 1; col <= (n - row) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
