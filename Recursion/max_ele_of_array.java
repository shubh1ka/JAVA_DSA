package Recursion;

import java.util.Scanner;

public class max_ele_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = max_ele(arr,n);
        System.out.println(ans);
    }

    public static int max_ele(int[] arr,int n) {
        if(n==1){
            return arr[0];
        }
        int max = max_ele(arr,n-1);
        return Math.max(max,arr[n-1]);

    }
}
