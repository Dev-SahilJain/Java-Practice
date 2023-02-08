import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[]arr= {12,23,34,45,56,67};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int Reverse(int[]arr){
       int start= 0;
       int end = arr.length-1;

        while(start<end){
            swap.Swap(arr, start, end);
            start++;
            end--;
        }
        return start;
    }
}
// reverse of an array 