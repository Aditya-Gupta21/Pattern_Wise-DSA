package TWO_POINTER_APPROCH;

public class Two_Sum_one {
    static void main() {
        int [] arr = {3,2,4};
        int target = 6;
        int [] result  = two_sum_indices(arr,target);

        if (result!= null){
            System.out.println("Indices : " + result[0] + "," + result[1]);
        }
        else {
            System.out.println("Not found");
        }
    }

//    method to calculate the sum of the index of the array
    public static int[] two_sum_indices(int [] arr , int target){

        int i = 0;      // here it is the starting index
        int j = arr.length-1;            // here it is the ending index

        while(i<j){

//            here we have to calculate the sum
            int sum = arr[i] + arr[j];

//            here if sum == target
            if(sum == target){
                return new int[]{i,j};
            }

//            here if sum > target
            else if (sum > target) {
                j--;
            }

//            here if sum < target
            else{
                i++;
            }
        }
        return null;

    }

}
