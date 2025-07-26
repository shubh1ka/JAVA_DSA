package basic_sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
       int[] arr = {5,-2,3,8,3};
       int n = arr.length;
       for(int j=0;j<n-1;j++) {
           for (int i = 0; i < (n - 1)-1; i++) {
               if (arr[i] > arr[i + 1]) {
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;

               }
           }


       }
       print(arr);
    }
}
