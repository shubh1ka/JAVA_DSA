package arrray;

import java.util.Scanner;

public class araaaay {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        for(int i=0;i<7;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        for(int i=0;i<7;i++){
//                System.out.print(arr[i]+" ");
//        }

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter array size");
        int n =  sc1.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Array element: ");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]<0)
               System.out.println(arr[i]);
        }

    }
}
