package Recursion.Lec_no_1;

public class reverse {
    static void main() {
        int n = 5;
        System.out.println(reverse(n));;
    }

//    method to print the reverse order
    public static int reverse(int n){

        if(n == 1){
            return 1;
        }

        System.out.println(n);
        return reverse(n-1);
    }
}
