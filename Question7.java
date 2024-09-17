package lesson5;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        int numberOne = 0, numberTwo = 1, numberThree = 1;
        while (numberThree <= n) {

            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;

            if (numberThree % 1 == 0 && numberThree % numberThree == 0 && numberThree % Math.sqrt(numberThree) != 0 && numberThree < n) {
                System.out.println("So nguyen to nho hon "+n+" la "+  numberThree);
            }
        }
    }
}

