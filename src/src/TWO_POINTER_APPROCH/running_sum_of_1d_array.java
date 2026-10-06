package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class running_sum_of_1d_array {
    static void main() {
        int [] arr = {1,2,3,4};

        int [] result = running_sum(arr);
        System.out.println(Arrays.toString(result));
    }

//    Method to calculate the running sum of 1 d array
    public static int[] running_sum(int [] arr){

        int  n = arr.length;    // length of an array

//        creating a new array
        int [] sum = new int[n];

        int i = 0;
        int j = 0;

        while (j <n){

            if(j == 0){
                sum[j] = arr[i];
                j++;
            }
            else {
                sum[j] = arr[j] + sum[i];
                i++;
                j++;
            }
        }
        return sum;
    }
}
