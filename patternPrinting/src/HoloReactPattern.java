// * * * * * *
// * - - - - *
// * - - - - *
// * * * * * *

// Solution First
//public class HoloReactPattern {
//    static void main(){
//        // rows = 4 -> n =4, column = 6
//        // 1 rows and nth rows -> stars 6
//        // rest all rows 1 star 4 space 1 star
//
//        int n = 4;
//        for (int row = 1; row <= n ; row++) {
//            if(row == 1 || row == n){
//                for (int col = 1; col <= 6; col++) {
//                    System.out.print("* ");
//                }
//            }
//                else {
//                for (int col = 1; col <= 1; col++) {
//                    System.out.print("* ");
//                }
//                for (int col = 1; col <= 4; col++) {
//                    System.out.print("  ");
//                }
//                for (int col = 1; col <= 1; col++) {
//                    System.out.print("* ");
//                }
//            }
//                System.out.println();
//        }
//    }
//}

//Solution Second

public class HoloReactPattern{
    static void main(){
        int n = 4;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= 6; col++) {
                if(row ==1 || row == n) {
                    System.out.print("* ");
                }
                else{
                    if(col == 1 || col == 6) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

        }
    }
}


