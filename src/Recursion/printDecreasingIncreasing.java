package Recursion;

import java.util.Scanner;

public class printDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PrintInc(N);

    }

    public static void PrintInc(int N) {
        if(N==0){
            return;
        }
        System.out.println(N);
        PrintInc(N-1);
        System.out.println(N);

    }
}
