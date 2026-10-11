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
    public static List<List<Integer>> find_four_sum(int [] arr, int target) {

        Arrays.sort(arr);

        int n = arr.length;

//        Creating the 2D linkList
        List<List<Integer>> result = new ArrayList<>();

//        Traverse the loop from i to n-3
        for(int i =0; i<n-3; i++){

//            here duplicate for the i
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

//            here start the j  from i +1
            for(int j = (i+1); j<n-2;j++){

                if(j > i +1 && arr[j] == arr[j-1]){
                    continue;
                }

//                here we start the p and q
                int p = j+1;
                int q = arr.length-1;

                while (p < q){

                    int sum = arr[i] + arr[j] + arr[p] + arr[q];

                    if (sum == target){
                        result.add(Arrays.asList(arr[i],arr[j],arr[p],arr[q]));
                        p++;
                        q--;

//                        duplicate for the p
                        while (p < q   && arr[p] == arr[p-1]){
                            p++;
                        }

                        //                     duplicate for the q
                        while (p < q   && arr[q] == arr[q+1]){
                            q--;
                        }
                    }
                    else if (sum < target) {
                        p++;
                    }
                    else {
                        q--;
                    }

                }

            }
        }
        return result;

    }


}
