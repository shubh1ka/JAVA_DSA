package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int result = fact(n);
        System.out.println(result);
//        int fact=n;
//        for(int i=0; i<n;i++){
//            fact=fact*(n-1);
//            n=n-1;
//        }
//        System.out.println(fact);
    }

    public static int fact(int N) {
        if(N<1){
            return 1;
        }
        int result= N;
        result = result*(fact(N-1));
        return(result);


    }
}
