package Pattern;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int col = sc2.nextInt();
        for(int i =1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
