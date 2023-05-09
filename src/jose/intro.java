package jose;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter one number: ");
        int num1 = input.nextInt();

        System.out.println("please enter another number: ");
        int num2 = input.nextInt();

        int num3 = num1 + num2;

        System.out.println(num3);

    }
}
/*
    1. create a program that ask the user enter 2 numbers to add them together and print the sum
 */