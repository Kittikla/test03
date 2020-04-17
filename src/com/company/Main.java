package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.printf("Input number 1 =");
        System.out.println(num1);
        System.out.printf("Input number 2 =");
        System.out.println(num2);
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
