package TWO_POINTER_APPROCH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    void main() {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = three_sum_calculate(arr);

        // Print each triplet
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

    }

//    Making the method is used to calculate the three sum
    public List<List<Integer>> three_sum_calculate(int [] arr){

        int n = arr.length;

//         CREATING AN 2D LIST
        List<List<Integer>> result  = new ArrayList<>();

//        sort the array
        Arrays.sort(arr);

//        Applying the loop i = 0 to i = n-2
        for(int i = 0;i<n-2;i++){

//            condition for the i > 0 and equal to previous then the answer is same
            if(i >0 && arr[i] ==arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = n-1;

            while(left < right){

//                here sum the values of the those
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){

                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));

//                    add the condition that left and right are equal values or not
                    while(left < right && arr[left] == arr[left+1]){
                        left++;
                    }

                    while(left < right&& arr[right] == arr[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }




        return result;
    }

}

