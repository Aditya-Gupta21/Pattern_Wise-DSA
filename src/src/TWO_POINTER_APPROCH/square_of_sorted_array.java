package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class square_of_sorted_array {
    static void main() {
        int [] arr = {-4,-1,0,3,10};
        int [] result = square_sorted_array(arr);
        System.out.println(Arrays.toString(result));
    }

//    method to find the square of the array
    public static  int[] square_sorted_array(int [] arr){
        int n = arr.length; // length of the array

//        Making the another array of different size
        int [] result = new int[n];

//        Applying the for loop
        for(int i = 0;i< arr.length;i++){
            result[i] = arr[i] * arr[i];
        }

//        Sort the array
        Arrays.sort(result);
        return result;

    }

}
