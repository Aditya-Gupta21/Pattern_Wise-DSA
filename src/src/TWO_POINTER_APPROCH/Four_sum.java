package TWO_POINTER_APPROCH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_sum {
    static void main() {
        int [] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = find_four_sum(arr,target);
        System.out.println(result);
    }

//    Method to find the 4 sum
    public static List<List<Integer>> find_four_sum(int [] arr, int target){

        int n = arr.length;

//        Creating the 2D linkList
        List<List<Integer>> result = new ArrayList<>();

//        Apply the 4 nested loop
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    for(int l = k+1;l<n;l++){

//                        Calculate the sum
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];

                        if(sum == target){
                            result.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        }
                    }
                }
            }
        }
        return  result;
    }
}
