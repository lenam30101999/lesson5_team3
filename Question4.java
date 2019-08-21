package lesson5;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        n = scanner.nextInt();
        int i=2;
        System.out.print(n+" = ");
        while(n>1){
             if(n%i==0) {
                 if (n / i != 1) {
                     System.out.print(i + " x ");
                 } else
                     {
                     System.out.print(i);
                 }
                 n=n/i;
             }else{
                 i++;
             }
        }
    }
}
