public class RightHalfPyramid {
    static void main() {
        //rows 5, column = 5, row 1 -> single *, row 2-> 2 ** ..
        int n = 9;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
