package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class Median_Of_Sorted_Array {
    static void main() {
        int [] arr1 = {1,2};
        int [] arr2 = {3,4};
        System.out.println(find_median_of_sorted_array(arr1, arr2));
    }

//    Method to find the median of the arrays
    public static double find_median_of_sorted_array(int [] arr1 , int [] arr2 ){

//        Making the another name as the array name as the merge
        int [] merge = new int[arr1.length + arr2.length];

//         Apply the for loop to fill the array 1 element
        for(int i = 0; i< arr1.length;i++){
            merge[i] = arr1[i];
        }

//        Apply the loop for fill the array2 element
        for(int i = 0;i< arr2.length;i++){
            merge[arr1.length + i] = arr2[i];
        }

//        Sort the merge array
        Arrays.sort(merge);

//        Here we find the length of the array
        int n = merge.length;

//         Here the condition of the median

//        if the length of the merge array is odd
        if(n %2 != 0){
            return merge[n/2];
        }
//         here if length of the merge array is even
        else{
            return (merge[n/2-1] + merge[n/2])/2.00;
        }
    }
}
