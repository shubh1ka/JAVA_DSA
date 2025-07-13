package arrray;

public class Segregate0and1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,0,0,1};
        for(int i = 0;i<(arr.length)-1;i=i+2){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int z=0;z<(arr.length);z++){
            System.out.print(arr[z]+" ");
        }


}}
