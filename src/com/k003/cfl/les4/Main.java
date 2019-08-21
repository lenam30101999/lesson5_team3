package com.k003.cfl.les4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        sont();
        int n;
        System.out.println("Nhap n: ");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        System.out.print("So fibonaci thu "+n+" la: ");
        System.out.print(fibonaci(n));
    }
    public static void sont(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = scan.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int fibonaci(int n){
        if(n==1||n==2) return 1;
        return fibonaci(n-1)+fibonaci(n-2);
    }
}
