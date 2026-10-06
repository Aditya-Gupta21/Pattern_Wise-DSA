package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class Three_sum_closet {
    static void main() {
        int [] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(closet_sum_find(arr,target));
    }

//    method to find the closet sum
    public static int closet_sum_find(int [] arr, int target){

//        Here we have to sort the array first
        Arrays.sort(arr);
        int closet_sum = 0;
        int max = Integer.MAX_VALUE;     // here we consider the max value sa --> infinity


//        Apply the loop for the traverse the array
        for(int i = 0;i<arr.length-2;i++){

//            here there is the no duplicate condition so we do not add the any condition

            int j = i+1;
            int k = arr.length-1;

            while(j < k){

//                here calculate the sum
                int sum = arr[i] + arr[j] + arr[k];

//                here we have to find the absolute difference
                int diff = Math.abs(target - sum);

                if(max > diff){
                    max = diff;
                    closet_sum = sum;
                }

//                Now here the conditions are start
                if(sum == target){
                    return sum;
                }
                else if (sum < target) {
                    j++;
                }
                else{
                    k--;
                }


            }
        }
        return closet_sum;
    }
}
