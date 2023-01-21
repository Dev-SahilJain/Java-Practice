public class Main {
    public static void main(String[] args) {
        int n = 5;

//        for (int i = 1; i <= n; i++) {
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i =0;i<2*n;i++){
            int cir = i>n ? 2*n-i:i ;
            int nos = n-cir;
            for (int j=0;j<nos;j++){
                System.out.print(" ");
            }
            for (int j=0;j<cir;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}