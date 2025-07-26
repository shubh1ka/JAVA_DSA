package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = fact(N);
        System.out.println(fact);
    }

    public static int fact(int N) {
        if (N<1){
            return 1;
        }
        int res=(N*fact(N-1));
        return res;
    }
}
