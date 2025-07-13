package arrray;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
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
