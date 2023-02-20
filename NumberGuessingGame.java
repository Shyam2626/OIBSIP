/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

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
      Random ran=new Random();
      Scanner sc=new Scanner(System.in);
      boolean flag=false;
      int r=ran.nextInt(11);
      System.out.println("WELCOME TO NUMBER GUESSING GAME....!!!!");
      System.out.println("\n\nRULES:");
      int maximum_guess=3,current_guess=0;
      while(current_guess!=maximum_guess){
        int x=sc.nextInt();
        if(x==r){
          System.out.println("\nPERFECT! You Choosen Correct Number  :)");
          System.out.println("\n\nCommon lets move to Round 2");
          flag=true;
          break;
        }
        else if(x<r){
          System.out.println("\nOpss! Your guess was too LOW, try some higher numbers.");
        }
        else if(x>r){
          System.out.println("\nOpss! Your guess was too HIGH, try some lowers numbers.");
        }
        current_guess++;
      }
      if(flag==false){
          System.out.print("\n\nSORRY..!!! Your Chances Are Over :(");
          System.out.println("\nThe random selected is ..  "+r);
          return;
      }
      if(flag==true){
        System.out.println("\nRound 2 is going to start....");
        r=ran.nextInt(51);
        maximum_guess=5;
        current_guess=0;
        while(current_guess!=maximum_guess){
            int x=sc.nextInt();
            if(x==r){
              System.out.println("\n\nPERFECT! You Choosen Correct Number  :)");
              System.out.println("\n\nCommon lets move to Round 3");
              flag=true;
              break;
            }
            else if(x<r){
              System.out.println("\nOpss! Your guess was too LOW, try some higher numbers.");
              flag=false;
            }
            else if(x>r){
              System.out.println("\nOpss! Your guess was too HIGH, try some lowers numbers.");
              flag=false;
            }
            current_guess++;
        }
      }
      if(flag==false){
          System.out.print("\nSORRY..!!! Your Chances Are Over :(");
          System.out.println("\nThe random selected is ..  "+r);
          return;
      }
      if(flag==true){
        System.out.println("\nRound 3 is going to start....");
        r=ran.nextInt(101);
        maximum_guess=5;
        current_guess=0;
        while(current_guess!=maximum_guess){
            int x=sc.nextInt();
            if(x==r){
              System.out.println("\n\nPERFECT! You Choosen Correct Number  :)");
              System.out.println("\n\nYour completed all the rounds.....CONGRATULATIONS..!!!!");
              flag=true;
              break;
            }
            else if(x<r){
              System.out.println("\nOpss! Your guess was too LOW, try some higher numbers.");
              flag=false;
            }
            else if(x>r){
              System.out.println("\nOpss! Your guess was too HIGH, try some lowers numbers.");
              flag=false;
            }
            current_guess++;
        }
      }
      if(flag==false){
          System.out.print("\nSORRY..!!! Your Chances Are Over :(");
          System.out.println("\nThe random selected is ..  "+r);
      }
  }
}

