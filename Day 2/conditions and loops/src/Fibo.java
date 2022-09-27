import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        // Fibonacci no.

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
            while(i<=n){
                int temp = b;
                b= b+a;
                a = temp;
                i++;
            }
        System.out.println(b);

    }
}
