// find no of rows -> rows = 4, rows -> n, rows( 1 -> n)
// for each row -> 4 column -> n column -> column ( 1 -> n)
// analyse of possible to create a formula
//
public class SolidSquarePattern{
    static void main(){
        int n = 4;
        for (int rows = 1; rows <= n ; rows++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
