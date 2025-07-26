package Recursion;

import java.util.Scanner;

public class sumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sum = sumofN(N);
        System.out.println(Sum);

    }

    public static int sumofN(int N) {
        if (N <= 0) {
            return 0;
        }
        int ans = N + sumofN(N - 1);
        return ans;
    }


}
