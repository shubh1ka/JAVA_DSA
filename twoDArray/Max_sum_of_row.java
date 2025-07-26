package twoDArray;

public class Max_sum_of_row {
    public static void main(String[] args) {
        int [][] arr = {{2,6,3},
                        {3,4,5},
                        {5,6,7}};
        int m = arr.length , n=arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        int maxRow=-1;
        for(int[] arr1D: arr){
            for(int ele: arr1D){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        for(int x=0;x<m;x++){
            int sum =0;
            for(int z=0;z<n;z++){
                sum = sum+arr[x][z];
            }
            if(sum>maxSum){
                maxSum=sum;
                maxRow= x;
            }

        }
        System.out.println(maxSum + " " + maxRow);
    }
}
