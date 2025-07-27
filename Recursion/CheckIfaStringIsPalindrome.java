package Recursion;

import java.util.Scanner;

public class CheckIfaStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og = sc.next();
        int n = og.length();
        int i =n-1;
        String rev_str=palindrome(og,i);
        if(rev_str.equals(og)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

    public static String palindrome(String og,int i) {
        if(i<0){
            return "";
        }
        String rev = og.charAt(i) + palindrome(og, i - 1);
        return rev;
    }
}
