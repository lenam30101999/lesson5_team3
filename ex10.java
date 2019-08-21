package ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex10 {
        private static final int DEC_10 = 10 ;

        public static void main(String[] args) {
            while(true){
                System.out.println(" ___________________________ MENU______________________________");
                System.out.println("| 1. List prime numbers:                                       |");
                System.out.println("| 2. List  reserve number:                                     |");
                System.out.println("| 3. Sum of numbers is a number of Fibonacci number sequence:  |");
                System.out.println("|______________________________________________________________|");
                System.out.println("You choose: ");
                Scanner input = new Scanner(System.in);
                int choose = input.nextInt();

                switch (choose){
                    case 1:{

                        for(int i = 10000; i <= 999999; i++){
                            if(checkPrimeNumber(i)) System.out.println(i + " ");
                        }

                        break;
                    }
                    case 2:{
                        for(int i = 10000; i <= 999999; i++){
                            if(reserveNumber(i))
                                System.out.println(i+" ");
                        }
                    }
                    case 3:{

                    }
                    default:
                        break;
                }
            }
        }

        public static boolean checkPrimeNumber(int PrimeNumber) {
            for(int i = 2; i <= Math.sqrt(PrimeNumber); i++){
                if(PrimeNumber % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static boolean reserveNumber(int reserveNumber) {
            List<Integer> listNumbers = new ArrayList<>();

            do {
                listNumbers.add(reserveNumber % DEC_10);
                reserveNumber = reserveNumber / DEC_10;
            } while (reserveNumber > 0);

            int size = listNumbers.size();
            for (int i = 0; i < (size/2); i++) {
                if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

