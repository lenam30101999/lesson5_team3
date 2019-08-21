package com.k003.team3;

public class Exam8 {
    public static void main(String[] args) {
        System.out.println("All palindromic number have 6 digits : ");
        for(long i = 100000; i <= 999999; i++){
            if(checkPalindromic(i)==true)
                System.out.println(i);
        }
    }
    public static boolean checkPalindromic(long integer){
        long sum = 0;
        long palin = integer;
        while (palin != 0){
            long h = palin % 10;
            sum = sum * 10 + h;
            palin = palin / 10;
        }
        if(sum == integer)
            return true;
        else
            return false;
    }
}
