package TWO_POINTER_APPROCH;

import java.util.Arrays;

public class segregate_zeroandone {
    static void main() {
        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate_one_and_zero(arr);
    }

//    method to segregate zero and one
    public static void segregate_one_and_zero(int [] arr ){

//         here i use the sort method
        Arrays.sort(arr);
    }

}
