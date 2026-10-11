package Sliding_Window;

public class Subarray_Sum_Equals_K {
    static void main() {
        int [] arr = {1,2,3};
        int target = 3;
        System.out.println(subarray_sum(arr,target));
    }

//    method to calculate the subarray sum
    public static int subarray_sum(int [] arr, int target){

        int low = 0;
        int high = 0;
        int count = 0;
        int sum = 0;

        while (high < arr.length && low< arr.length ){

//            here adding the sum
             sum += arr[high];

            if(sum == target){
                count++;
                high++;
            }
            else if (sum < target) {
                high++;
            }
            else {
                sum = sum - arr[low];
                low++;
            }
        }
        return count;
    }
}
