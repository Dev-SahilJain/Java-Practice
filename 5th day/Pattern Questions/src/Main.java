public class Main {
    public static void main(String[] args) {
//        **************************** Butterfly Pattern **********************************************
//        int n=4;
//        for (int i =1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(n-i);
//            for (int j= 1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i =n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(n-i);
//            for (int j= 1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *********************************************************************************************************

//                                     Pattern 11 - Solid rhombus
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        *******************************************************************************************************8

//                                       Pattern 12 - Number Pyramid
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        **********************************************************************************************

//                                       Pattern - Palindromic
//        int n=5;
//        for(int i =1;i<=n;i++){
////            for spaces
//            for (int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
////            for first half of no.
//            for (int j =i;j>=1;j--){
//                System.out.print(j);
//            }
////            for 2nd half
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        ***********************************************************************************************
//                                          Pattern - Diamond Pattern
        int n =4;

            for (int i =1;i<=n;i++){
               for (int j=1;j<=n-i;j++){
                   System.out.print(" ");
               }
//               for upper half
                for (int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int i =n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//               for lower half
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}