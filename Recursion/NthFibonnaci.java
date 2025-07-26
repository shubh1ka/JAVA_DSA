package Recursion;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt();
        int Ans= fibo(N);
        System.out.println(Ans);
    }

    public static int fibo(int N) {
            if(N==0 || N==1){
                return  N;
            }
            return fibo(N-1)+fibo(N-2);
    }
}
