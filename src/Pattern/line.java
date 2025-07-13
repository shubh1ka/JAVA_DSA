package Pattern;

import java.util.Scanner;

public class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=3;j++){
                System.out.println(" "+" " + "*"+" ");
            }
        }
    }
}
