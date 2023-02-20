import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SHYAM K
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int r = ran.nextInt(11);
        System.out.println("----------WELCOME TO NUMBER GUESSING GAME-----------");
        System.out.println("RULES OF THE GAME:");
        System.out.println("    1.A Random Number have been automatically created.");
        System.out.println("    2.Your Job is to find that number");
        System.out.println("    3.The Game consists of Three rounds.");
        System.out.println("    4.For each round you where given a limited numbers of chances to find the number.");
        System.out.println("    5.For each round the range of the number should varies.");
        System.out.println("\n\n----------COMMON GET READY FOR ROUND 1-----------");
        System.out.println("RULES :  \n 1.NUMBER OF CHANCES : 3\n 2.RANGE : 1-10\n 3.You must find the unknown number to enter ROUND 2");
        int maximum_guess = 3, current_guess = 0;
        while (current_guess != maximum_guess) {
            System.out.printf("\nYour Remaining Chances are %d,\nEnter a Number :",maximum_guess-current_guess);
            int x = sc.nextInt();
            if (x == r) {
                flag=true;
                System.out.println("\nPERFECT! You Choosen Correct Number  :)\nYou are selected to ROUND 2");
                System.out.println("\n\n----------COMMON GET READY FOR ROUND 2-----------");
                break;
            } else if (x < r) {
                System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
            } else if (x > r) {
                System.out.println("Opss! Your guess was too HIGH, try some lowers numbers.");
            }
            current_guess++;
        }
        if (flag == false) {
            System.out.print("\n\nSORRY..!!! Your Chances Are Over :(");
            System.out.println("\nThe random selected is ..  " + r);
            return;
        }
        if (flag == true) {
            System.out.println("\nRULES :  \n 1.NUMBER OF CHANCES : 5\n 2.RANGE : 1-50\n 3.You must find the unknown number to enter ROUND 3");
            r = ran.nextInt(51);
            maximum_guess = 5;
            current_guess = 0;
            while (current_guess != maximum_guess) {
                System.out.printf("\nYour Remaining Chances are %d,\nEnter a Number :",maximum_guess-current_guess);
                int x = sc.nextInt();
                if (x == r) {
                    System.out.println("\nPERFECT! You Choosen Correct Number  :)");
                    System.out.println("\n\n----------COMMON GET READY FOR ROUND 2-----------");
                    flag = true;
                    break;
                } else if (x < r) {
                    System.out.println("\nOpss! Your guess was too LOW, try some higher numbers.");
                    flag = false;
                } else if (x > r) {
                    System.out.println("\nOpss! Your guess was too HIGH, try some lowers numbers.");
                    flag = false;
                }
                current_guess++;
            }
        }
        if (flag == false) {
            System.out.print("\nSORRY..!!! Your Chances Are Over :(");
            System.out.println("\nThe random selected is ..  " + r);
            return;
        }
        if (flag == true) {
            System.out.println("\nRULES :  \n 1.NUMBER OF CHANCES : 5\n 2.RANGE : 1-100");
            r = ran.nextInt(101);
            maximum_guess = 5;
            current_guess = 0;
            while (current_guess != maximum_guess) {
                System.out.printf("\nYour Remaining Chances are %d,\nEnter a Number :",maximum_guess-current_guess);
                int x = sc.nextInt();
                if (x == r) {
                    System.out.println("\n\nPERFECT! You Choosen Correct Number  :)");
                    System.out.println("\n\nYour completed all the rounds....");
                    flag = true;
                    break;
                } else if (x < r) {
                    System.out.println("\nOpss! Your guess was too LOW, try some higher numbers.");
                    flag = false;
                } else if (x > r) {
                    System.out.println("\nOpss! Your guess was too HIGH, try some lowers numbers.");
                    flag = false;
                }
                current_guess++;
            }
        }
        if (flag == false) {
            System.out.print("\nSORRY..!!! Your Chances Are Over :(");
            System.out.println("\nThe random selected is ..  " + r);
        }
        else{
            System.out.print("-------CONGRATULATIONS--------\n   HURRAYY..!!!!  You are a WINNER.");
        }
    }
}
