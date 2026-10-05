package Recursion.Lec_no_1;

import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number want to calculate factorial : ");
        int n = sc.nextInt();

        System.out.println("Factorial of the number is : " + fact(n));
        sc.close();
    }

//    method to calculate the recursion
    public static int fact(int n ){

        if(n == 1){
            return 1;
        }

        int ans = fact(n-1) *(n);
        return ans;
    }
}
