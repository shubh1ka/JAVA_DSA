package Loops;

import java.util.Scanner;

public class RaisedToPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        int i =1;
        int c= 1;
        for(i=1;i<=b;i++){
            c=c*a;
            System.out.println(c);
        }

    }
}
