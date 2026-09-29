//  _ _ _ _ *
//  _ _ _ * * *
//  _ _ * * * * *
//  _ * * * * * * *
//  * * * * * * * * *
public class SolidTriangle {
    static void main(){
        // n = 5, col = 9, row 1 = one *, 4 space,-- row 2 = 3 * , 3 space, row 3 = 5 * 2 space,
        // spaces -- n - row, stars -->  curent row + ( curentrow - previous row).

        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= (n - row); space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row + (row - 1) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
