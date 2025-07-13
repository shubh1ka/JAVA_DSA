package if_else;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        System.out.println("Enter your 1 number");
        int num = nsc.nextInt();


        Scanner nsc1 = new Scanner(System.in);
        System.out.println("Enter your 2 number");
        int num1 = nsc.nextInt();


        Scanner nsc2 = new Scanner(System.in);
        System.out.println("Enter your 3 number");
        int num2 = nsc.nextInt();


        if(num==num1 && num==num2 && num1==num2){
            System.out.println("numbers are equal");
        }else if(num>num1 && num>num2){
            System.out.println("Greatest number:"+num);

        }else if(num1>num && num1>num2){
            System.out.println("Greatest num: "+num1);
        }

        else {
            System.out.println("Greatest num: "+num2);
        }

    }
}
