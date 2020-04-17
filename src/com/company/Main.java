package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input number 1 = ");
        int num1 = scan.nextInt();
        System.out.printf("Input number 2 = ");
        int num2 = scan.nextInt();
        System.out.printf("Number1 + Number2 =");
        System.out.println(num1+num2);
        System.out.printf("Number1 - Number2 =");
        System.out.println(num1-num2);
        System.out.printf("Number1 * Number2 =");
        System.out.println(num1*num2);
        System.out.printf("Number1 / Number2 =");
        System.out.println(num1/num2);


    }
}
