package Pattern;

import java.util.Scanner;

public class flyodsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
//        Scanner sc2 = new Scanner(System.in);
//        int col = sc2.nextInt();

        for(int i =1;i<=row;i++){
            int z = 1;
            for(int j=1;j<=i;j++){
                System.out.print(z);
                z+=2;
            }
            System.out.println();
        }
    }
}
