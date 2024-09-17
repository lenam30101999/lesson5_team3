package com.k003.team3;

import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input n: ");
        long number = scan.nextInt();

        System.out.println("1.Sum of all digits of n");
        System.out.println("2.Analyze n into prime numbers");
        System.out.println("Your choice: ");

        int choice = scan.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Sum of all digits of n : " + Sum(number));
                break;
            }

            case 2:{
                Analyze(number);
                break;
            }

        }
    }

    public static long Sum(long number){
        long sum = 0;
        while (number != 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void Analyze(long number){
        System.out.println(number + " can be analyzed into prime number like: ");
        int init = 2;
        while (number > 1){
            if(number % init == 0){
                System.out.print(init + " ");
                number = number / init;
            }
            else
                init++;
        }
    }
}
