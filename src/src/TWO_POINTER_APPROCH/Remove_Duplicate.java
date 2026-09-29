package TWO_POINTER_APPROCH;

public class Remove_Duplicate {
    static void main() {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove_duplicate(arr));
    }

//    method to count how many unique element are there
    public static int remove_duplicate(int [] arr ){

//        here i consider the first element as unique
        int unique = 1;
        int n = arr.length;

        int i = 0;
        int j = (i +1);

        while(j < n){

//            here j == i then we have to move right
            if (arr[j] == arr[j-1]){
                j ++;
                continue;
            }

//            if not equal
            else {
                arr[i + 1] = arr[j];
                i++;
                unique++;
                j++;
            }
        }
        return unique;

    }

}
