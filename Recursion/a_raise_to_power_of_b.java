package Recursion;

import java.util.Scanner;

public class a_raise_to_power_of_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=poww(a,b);
        System.out.println(ans);
        int  c = (int) Math.pow(a,b);
        System.out.println(c);

    }

    public static int poww(int a,int b) {
        if(b==0){
            return 1;
        }
        int res = a * poww(a,b-1);
        return res;

    }
}
