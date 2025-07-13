package Pattern;

import java.util.Scanner;
//reverse pyramid
//public class pyramind_print {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for(int i=1;i<=row;i++){
//            for(int j=i;j<=row;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}


////Pyramid
public class pyramind_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i==1 ) {
                    System.out.println(i+" "+j+" "+row);
                    System.out.println("_" + "_" + "*" + "_" + "_");
                }else{
                    continue;
                }
                if (j == 2 || i==2) {
                    System.out.println(i+" "+j+" "+row);
                    System.out.println("_" + "_" + "*" + "*" + "_" + "_");
                }
                if (j == 3 && i==1) {
                    System.out.println(i+" "+j+" "+row);
                    System.out.println("_" + "_" + "*" + "*" + "*" + "_" + "_");

                }
                System.out.println();
            }
        }
    }
}
