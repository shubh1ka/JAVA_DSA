package arrray;

import java.util.Scanner;

public class multiply_odd_indx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter you array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array is: ");
        for(int z=0;z<n;z++){
            System.out.print(arr[z]+" ");
        }


        for(int j=0;j<n;j++){
            if(j%2!=0){
                arr[j]=arr[j]*2;
            }else{
                arr[j]=arr[j]+10;
            }
        }
        System.out.print("Your new array is: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }


    }
}
