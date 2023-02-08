import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 67, 89};
        Swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr,int  index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;

    }
}

//            Swapping of ELEMENTS IN ARRAYS