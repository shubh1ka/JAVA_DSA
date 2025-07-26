package OOPS;

import java.util.Scanner;

public class GCD_Of_two_numbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
      int hcf = GCD(a,b);
      System.out.println(hcf);

    }


    public static int GCD(int a , int b) {
        if(a==0){
            return b;
        }
        int res=GCD(b%a,a);
        return res;
    }
}

