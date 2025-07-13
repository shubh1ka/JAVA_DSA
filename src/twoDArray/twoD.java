package twoDArray;

import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        int [][] arr = new int[4][5];
        Scanner sc = new Scanner(System.in);
        //rows-0-3 and col 0 to 4
        arr[2][1] = 8;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
