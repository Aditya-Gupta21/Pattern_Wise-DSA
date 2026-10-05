package Recursion.Lec_no_1;

import static java.lang.Math.*;

public class power_question {
    static void main() {
        int x = 3;
        int n = 5;
        System.out.println(power(x,n));

    }

//    method to calculate the x power n
    public static int power(int x, int n){

        if (n == 0){
            return 1;
        }

        int ans = power(x,n-1) * x;
        return ans;

    }
}
