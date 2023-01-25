import java.util.*;
;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ********************************* Question 1 *****************************************88
//        int size = sc.nextInt();
//        String[] names = new String[size];
//
//        for (int i =0;i<size;i++){
//            names[i]= sc.next();
//        }
//
//        for (int i =0;i<names.length;i++) {
//            System.out.println("name "+ (i+1)+ "is " + names[i]);
//        }
//        ********************************************************************************************

////        *********************************** Question 2 **********************************************
//        int size = sc.nextInt();
//        int [] numbers = new int[size];
//
//        for (int i=0;i<size;i++){
//            numbers[i]= sc.nextInt();
//        }
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i=0;i<numbers.length;i++){
//            if (numbers[i] <min){
//                min = numbers[i];
//            }
//            if (numbers[i]>max){
//                max = numbers[i];
//            }
//
//        }
//        System.out.println("max no. is "+max);
//        System.out.println("min no. is "+min);

//        ************************************************************************************************

//        ******************************** Question 3 *******************************************

        int size = sc.nextInt();
        int [] numbers = new int[size];
        for (int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        boolean isAscending= true;

        for (int i=0;i< numbers.length-1;i++){
            if (numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }
        if (isAscending){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }
    }
}
