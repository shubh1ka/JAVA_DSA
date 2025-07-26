

import java.util.Scanner;

public class Printing_numbers{
    public static void main(String[] args) {
        Scanner cp = new Scanner(System.in);
        System.out.println("Enter your number");
        double cp1 = cp.nextDouble();

        if (cp1 % 3 == 0 && cp1 % 5 == 0) {
            System.out.println("Divisible by both 5 and 3");
        } else if (cp1 % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (cp1 % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        if (cp1 % 3 == 0 || cp1 % 5 == 0) {
            System.out.println("Divisible by either 5 or 3");
        }

        cp.close();
    }
}
