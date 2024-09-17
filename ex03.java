package ex03;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {

        System.out.println("Input n");
        int n= input();
        System.out.println("Input base want to change to b: ");
        int b= input();
        System.out.println("Number " +n+ " change to base " +b+ " become: ");
        changeBase(n,b);
    }


    public static void changeBase(int n,int base){
        if(n>=base) changeBase(n / base, base);
        if(n % base>9) System.out.printf("%c",n%base+55);
        else
            System.out.print((n % base));
    }
    public static int input() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;

            } catch (Exception e) {
                System.out.println("Please Input the Number: ");
                input.nextLine();
            }
        }
        return (n);
    }}
