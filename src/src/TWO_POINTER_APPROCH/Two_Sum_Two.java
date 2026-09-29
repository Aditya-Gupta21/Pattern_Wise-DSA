package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class Two_Sum_Two {
    static void main() {
        int [] arr = {2,7,11,15};
        int target = 9;
        int [] result = two_sum_index_find(arr,target);

        if (result != null){
            System.out.println("Indices are : " + result[0] + "," + result[1]);
        }
        else{
            System.out.println("Not Found");
        }
    }

//    here i make the method to find the whose index sum is equal to target
    public static  int [] two_sum_index_find(int [] arr , int target){

        Arrays.sort(arr);    // here i sort the array

        int i = 0;  // starting index
        int j = arr.length-1;

        while(i<j){

            int sum = arr[i] + arr[j];   // here it is find the sum of the index

            if(sum == target){
                return new int[] {i,j};
            }

            else if (sum > target) {
                j--;
            }

            else {
                i++;
            }
        }
        return null;
    }


}
