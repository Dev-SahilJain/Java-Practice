import java.util.*;
public class Arrays {

    public static void main(String[] args) {
//        type[] arrayname = new type[];    #this is the syntax
//        int[] marks = new int[3];          |
//        marks[0]=45;                       |   this is method one
//        marks[1]=47;                       |
//        marks[2]=49;                       |

//        int[] marks = {45,47,49};       this is method 2
//        for (int i =0;i<3;i++){
//            System.out.println(marks[i]);
//        }

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int [] numbers= new int[size];
//
//        for (int i=0;i<size;i++){
//            numbers[i]= sc.nextInt();
//        }
//
//        for (int i=0;i<size;i++){
//            System.out.println(numbers[i]);
//        }
//        ************************************ Question -1 ***************************
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers= new int[size];

        for (int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i=0;i< numbers.length;i++){
            if (numbers[i]==x){
                System.out.println("x found at index: "+i);
            }

        }
    }
}
