import java.util.Scanner;
public class casetype {
    public static void main(String[] args) {
        // ********** program for finding if an alphabet is upper or lower case ***********
        Scanner in = new Scanner(System.in);
          char a = in.next().trim().charAt(0);
         if( a>= 'a' && a<='z'){
             System.out.println("Lowercase");
         }else {
             System.out.println("Uppercase");
         }
    }
}
