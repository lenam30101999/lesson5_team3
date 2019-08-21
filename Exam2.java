package com.k003.lesson5;

import java.util.Scanner;

public class Exam2 {
    private int a, b;
    private void inIt(){
        System.out.print("Enter a and b: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
    }

    public void findGreatestCommonDivisor(){
        inIt();
        if(a == 0 || b == 0){
            System.out.println("The greatest common convention of a and b: " + (a + b));
        }
        while(a != b){
            if(a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("The greatest common convention of a and b: " + a);
    }
}
