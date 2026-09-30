package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class Merge_Sorted_Arrays {
    static void main() {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};

        int m = 3;    // length of the arr1
        int n = 3;   // length of the arr2

        merge_two_sortedarray(arr1, m, arr2, n);

    }

    //    method to making the sorted array
    public static void merge_two_sortedarray(int[] arr1, int m, int[] arr2, int n) {

//        here we start the calculation from the left
        int i = m - 1;     // start from the last index
        int j = n - 1;     // start from the last
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] >= arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;

            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }

        }
        //            if element at arr2 is left
        while (j >= 0) {
            arr1[k] = arr2[j];
            k--;
            j--;
        }


    }
}
