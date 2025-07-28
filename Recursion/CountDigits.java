package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int ans =digits_Counter(n,count);
        System.out.println(ans);
    }

    public static int digits_Counter(int n,int count) {
        if(n==0){
            return count ;
        }
        return digits_Counter(n/10,count+1);

    }

}
