public class Main {
    public static void main(String[] args) {
//        ********************Pattern 1 - Solid Rectangle *****************
//        int n =4;
//        int m=5;
//        outer loop
//        for( int i=1;i<=n;i++){
//        inner loop
//            for( int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      ************************************************************************
//                       Pattern 2 - Hollow rectangle
//        outer loop
//        for (int i =1;i<=n;i++){
////            inner loop
//            for ( int j=1;j<=m;j++){
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        ********************************************************************************
//                                  Pattern 3-half pyramid
//        for( int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        *************************************************************************************
//                                  Pattern 4 - inverted half pyramid
//        for(int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        *************************************************************************************
//                                      Pattern 5 - inverted half pyramid (rotated by 180 )
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        *********************************************************************************************
//                                          Pattern 6 -half pyramid with no.
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"");
//            }
//            System.out.println();
//        ***********************************************************************************************
//                                           Pattern 7 - inverted half pyramid with no.
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"");
//            }
//            System.out.println();
//        *********************************************************************************************
////                                             Pattern 8 - Floyd's triangle
//        int n=5;
//        int number=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(number);
//                number++;
//            }
//            System.out.println();
//        *************************************************************************************************
//                                    Pattern 9 - 01 triangle
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}