package if_else;

import java.util.Optional;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner cp = new Scanner(System.in);
        System.out.println("Enter your number");
        int cp1 = cp.nextInt();
        int i = 0;
        int c = cp1;
        for (i = 1; i <= 4; i++) {
            int d = c / 10;
            c = d;
            System.out.println(c);
            if(c == 0){
                break;
            }

        }
        int final_index = i;
        if (final_index == 4) {
            System.out.println("Number is of 4 digit");
        }else{
            System.out.println("Number is of less than 4 digit");
        }
    }
}
