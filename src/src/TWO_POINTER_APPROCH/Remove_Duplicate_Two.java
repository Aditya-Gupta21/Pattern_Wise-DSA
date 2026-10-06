package TWO_POINTER_APPROCH;

public class Remove_Duplicate_Two {
    static void main() {
        int [] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(remove_duplicate_element_two(arr));

    }

//    Methods to solve remove duplicate 2
    public static  int remove_duplicate_element_two(int [] arr ){

        int n = arr.length;
        int i = 0;
        int j = i+1;
        int unique = 1;

        if(n <= 2){
            return n;
        }

        while(j<n){

//            here if both element are same
            if(arr[j] == arr[j-1]){
                j++;

            }
            else{
                arr[i+2] = arr[j];
                unique = unique+2;
                i = i+2;
                j++;
            }
        }
        return unique;

    }

}
