package searchh;

public class min_array {
    public static void main(String[] args) {
        int [] arr= {1,3,5,88,3};
        int min= arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(min);
    }
}
