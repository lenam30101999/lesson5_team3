package com.k003.lesson5;

import java.util.Scanner;

public class Exam5 {
    private int n;
    private void inIt(){
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
    }
    private boolean isPrimeNumber(int a){
        if(a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    public void listPrimeNumber(){
        inIt();
        System.out.print("Sequence of prime numbers: ");
        int cout = 0;
        int i = 2;
        while (cout < n) {
            if (isPrimeNumber(i)) {
                System.out.print("\t" + i + " ");
                cout++;
            }
            i++;
        }
    }
}
