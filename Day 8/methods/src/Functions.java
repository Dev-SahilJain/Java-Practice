import java.util.*;

public class Functions {
//  1.
//    public static int printSum(int a, int b) {
//        int sum = a+b;
//        return sum;

// 2.
//    public static int calculateProduct(int a , int b){
//        return a * b;

    public static void printFactorial(int n){
        int factorial= 1;
        if (n<0){
            System.out.println("Invalid no. ");
            return;
        }
        for (int i =n;i>=1;i--){
             factorial = factorial*i;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = printSum(a,b);
//        System.out.println(sum);

//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//
//        System.out.println("product of two numbers is "+ calculateProduct(a ,b))
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//
//        System.out.println("product of two numbers is "+ calculateProduct(a ,b));

}