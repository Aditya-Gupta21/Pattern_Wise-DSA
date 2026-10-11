package Sliding_Window;

public class Subarray_Product_Less_Than_K {
    static void main() {
        int [] arr = {10,5,2,6};
        int k = 100;
        System.out.println(variable_window(arr,k));
    }

//    method to find the values
    public static int variable_window(int []arr, int k){

        int low = 0;
        int high = 0;
        int product = 1;
        int len = 0;

        while(high < arr.length){

//            growing the window
            product *= arr[high];

//            shrinking the window
            while (product >= k  && low<= high){
                product /= arr[low];
                low++;
            }

//            answer update
            len += high-low+1;
            high++;
        }
        return len;
    }
}
