public class HoloRightHalfTriangle {
  static void main(){
      int n = 6;
      for (int row = 1; row <= n; row++) {
          // first second and last row
          if (row == 1 || row == 2 || row == n){
              for (int col = 1; col <= row ; col++) {
                  System.out.print("* ");
              }
          }
          else {
              //middle rows
              for (int col = 1; col <= row; col++) {
              if(col == 1 || col == row){
                  System.out.print("* ");
              }
              else {
                  System.out.print("  ");
              }

              }
          }
          System.out.println();
      }
  }
}
