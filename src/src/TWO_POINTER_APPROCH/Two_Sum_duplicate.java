package TWO_POINTER_APPROCH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Sum_duplicate {
    static void main() {
        int [] arr = {1,1,1,2,2,3,3,3};
        int target = 4;

        List<List<Integer>> ll = two_sum(arr,target);
        System.out.println(ll);
    }

//    method to find the pairs of sum equal to target with the unique values
    public static List<List<Integer>> two_sum(int [] arr, int target){

//        Creating the 2D array
        List<List<Integer>> result = new ArrayList<>();

//        Here sort the array
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;

//        apply the loop
        while(i<j){

            int sum = arr[i] + arr[j];

            if(sum == target){
                result.add(Arrays.asList(arr[i],arr[j]));
                i++;
                j--;

//                here i and j values are same in the future
                while (i < j && arr[i] == arr[i-1]){
                    i++;
                }

                while(i < j && arr[j]  == arr[j+1]){
                    j--;
                }
            }

//             here sum < target
            else if (sum < target) {
                i++;
            }

//            here sum > target
            else{
                j--;
            }


        }
        return result;
    }


}
