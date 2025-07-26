package Ternary_Operator;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int c = sc.nextInt();


        int p = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(p);
    }
}
