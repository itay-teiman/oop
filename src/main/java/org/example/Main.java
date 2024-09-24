package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/////
public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("type num one");
        int num1 = myObj.nextInt();
        System.out.println("type num Two");
        int num2 = myObj.nextInt();

        System.out.println("+"+" "+(num1+num2));
        System.out.println("-"+" "+ (num1-num2));
        System.out.println("*"+" "+(num1*num2));
        System.out.println("/"+" "+(double)(num1/num2));





    }
}