package twoDArray;

public class arrayofarray {
    public static void main(String[] args) {
        int [][]arr = new int[4][5];
        arr[0][0] = 7;
        arr[0][1] =2;
        arr[0][3] = 9;
        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]+" ");
//            }

//        }
        for(int ele:arr[i]){
            System.out.print(ele+" ");
        }
        System.out.println();
        }

    }
}
