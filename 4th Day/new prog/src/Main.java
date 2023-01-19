import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//
//        if (x%2==0){
//            System.out.println("x is even ");
//        }
//        else{
//            System.out.println("x is odd");
//        }

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a==b){
//            System.out.println("a and b are equal");
//        }
//        else if (a<b) {
//            System.out.println("b is greater");
//        }
//        else {
//            System.out.println("a is greater");
//        }
        int button = sc.nextInt();
//        if(button==1){
//            System.out.println("hello");
//        } else if (button==2) {
//            System.out.println("hi");
//        } else if (button==3) {
//            System.out.println("namaste");
//        }
//        else {
//            System.out.println("waka");
//        }
        switch (button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("hi");
            break;
            case 3 : System.out.println("Namaste");
            break;
            default: System.out.println("waka");
        }
    }
}
