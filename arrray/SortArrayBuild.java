package arrray;

import java.util.Scanner;

public class SortArrayBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr=  new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }


    }
}
