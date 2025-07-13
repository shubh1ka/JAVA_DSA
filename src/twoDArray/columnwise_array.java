package twoDArray;

public class columnwise_array {
    public static void main(String[] args) {
        int [][] arr = {{2,6,3,7},
                        {3,4,5,7},
                        {5,6,7,78},
                        {1,2,3,4}};


        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i] = temp;
                }else{
                    continue;
                }

            }
        }
//        for(int i=0;i<arr[0].length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[j][i]+" ");
//            }System.out.println();
//        }

    }
}
