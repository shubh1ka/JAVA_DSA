package Pattern;

import java.util.Scanner;

public class traingle_flip_vertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }
        for(int i =1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+" "+"*"+" ");

            }
            System.out.println();

        }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=3;j++){
                System.out.println(" "+" " + "*"+" ");
            }
        }
    }
}
