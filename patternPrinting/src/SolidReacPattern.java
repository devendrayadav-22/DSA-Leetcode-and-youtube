public class SolidReacPattern {
    static void main(){
        int n = 3;
        for (int rows = 0; rows < n; rows++) {
            int m = 5;
            for (int col = 0; col < m; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
