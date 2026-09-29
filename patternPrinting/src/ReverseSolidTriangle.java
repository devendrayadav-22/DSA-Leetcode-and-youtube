public class ReverseSolidTriangle {
    static void main(){
        int n = 5;
        for (int row = 1; row <= n; row++){
         int star = (n - row) * 2 + 1;
            for (int space = 1; space < row; space++) {
                System.out.print("  ");
            }
         for (int col = 1; col <= star; col++){
            System.out.print("* ");
         }
        System.out.println();
        }
    }
}
