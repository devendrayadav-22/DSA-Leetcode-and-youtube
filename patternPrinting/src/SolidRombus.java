//  _ _ _ _ * * * * *
//  _ _ _ * * * * * _
//  _ _ * * * * * _ _
//  _ * * * * * _ _ _
//  * * * * * _ _ _ _
public class SolidRombus {
    static void main(){
        //rowsTotal = 5 -> so n =5, columnn = 9,
        // find formula -> space --> n - row(1,2,3...), total star = 5, then row -1 space again
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spa = 1; spa <= (n - row); spa++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=5 ; col++) {
                System.out.print("* ");
            }
//            for (int spa2 = 1; spa2 < (row -1); spa2++) {
//                System.out.print("  ");
//            }
            System.out.println();
        }
    }
}
