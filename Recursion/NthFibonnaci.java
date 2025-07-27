package Recursion;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int val=fibo(N);
    System.out.println(val);

    }

    public static int fibo(int n) {
        if(n<=1){
            return n;
        }
        int fibs = fibo(n-1)+fibo(n-2);
        return fibs;
    }
}
