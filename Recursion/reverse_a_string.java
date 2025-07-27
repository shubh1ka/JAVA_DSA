package Recursion;

import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og_str = sc.next();
        int n = og_str.length();
        int i = n-1;
        String val=reverse(og_str,i);
        System.out.println(val);
    }

    public static String reverse(String og_str,int i) {
         if(i<0){
             return "";
         }
         String new_str = "";
         new_str = og_str.charAt(i) + reverse(og_str,i-1);
         return new_str;

    }
}
