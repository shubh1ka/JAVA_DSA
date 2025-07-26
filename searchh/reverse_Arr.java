package searchh;

public class reverse_Arr {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        System.out.println(arr.length);
        int temp = 0;
        for(int i=0;i<arr.length;i++){
           for(int j=(arr.length-1);j>=0;j--){
               if(i<j){
                   temp =arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }

        }
        for(int ele:arr){
            System.out.print(ele);
        }
    }
}
