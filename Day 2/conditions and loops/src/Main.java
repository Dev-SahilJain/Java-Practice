import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        *********max=******* Program for largest no.************

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max =a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }

//        int max = Math.max(a,b);45          //it is a more optimized method  only for two integers


         int max= Math.max(c,Math.max(a,b));     // now this method can be used for all three together
        System.out.println(max);
    }
}