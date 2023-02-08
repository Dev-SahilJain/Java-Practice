public class Max {
    public static void main(String[] args) {
        int[] arr= {23,34,45,56,67};
     //   System.out.println(max(arr));this is the simple method
        System.out.println(maxRange(arr,1,4));
    }
    //static int max(int[]arr){
    static int maxRange(int[]arr,int start,int end ){
        int maxVal= arr[start];
        for (int i=start;i<=end;i++){
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }

        return maxVal;
    }
}
//                  max value in an array


//we can also do for range

