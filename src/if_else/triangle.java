package if_else;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner cp = new Scanner(System.in);
        System.out.println("Enter your side1");
        double cp1 = cp.nextDouble();
        Scanner cp2 = new Scanner(System.in);
        System.out.println("Enter your side2");
        double cp12 = cp.nextDouble();
        Scanner cp3 = new Scanner(System.in);
        System.out.println("Enter your side3");
        double cp13 = cp.nextDouble();

        if(cp1+cp12>cp13 && cp12+cp13>cp1 && cp1+cp13>cp12) {
            System.out.println("Valid triangle");

        }
        else{
            System.out.println("Not a valid condition");
        }

    }
}
