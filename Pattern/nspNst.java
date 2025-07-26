package Pattern;

import java.util.Scanner;

public class nspNst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
//        Scanner sc2 = new Scanner(System.in);
//        int col = sc2.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;
            System.out.println();

        }
    }
}

