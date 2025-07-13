package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int result= fact(n);
        System.out.println(result);
    }

    public static int fact(int n ) {
        if(n==0||n==1){
            return 1;
        }

        int ans = n * fact(n-1);
        return ans;


    }
}
