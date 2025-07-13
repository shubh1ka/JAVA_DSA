package twoDArray;

public class printSnakePattern {
    public static void main(String[] args) {
        int [][] arr = {{2,6,3,7},
                        {3,4,5,7},
                        {5,6,7,78}};
        int m = arr.length ,n =arr[0].length;
        for(int i=0;i<m;i++){
            if(i%2 ==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }System.out.println(" ");


        }
    }
}
