package arrray;

import java.util.Scanner;

public class AddArrayelemt {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter array size");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.print("Enter Array: ");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int sum =0;
       for(int j=0;j<n;j++){
           sum=sum+arr[j];


       }
        System.out.println(sum);

    }
}
