package searchh;

import java.util.Scanner;

public class searchAnelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] c_arr = new int[n];
        System.out.println("Enter your array ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array is: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
        int found=-1;
        System.out.println("Enter element to be searched: ");
        int ele = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
               found = i;
               break;
            }
        }

        if (found!=-1) {
            System.out.println("Element is present at :"+found);
        }else{
            System.out.println("Element is not present");
        }




    }
}
