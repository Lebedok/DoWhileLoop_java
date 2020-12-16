package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    public static void main(String[] args) {
        // First we will flip coin then we will ask user to guess the result
        //if the user it correctly we will print you are lucky
        // otherwise we will print "Yoy are loser"
        // do you want play again ? yes / no

        Random random = new Random();
        String answer;
        int count = 0;
        do {
            int number = random.nextInt(2);
            Scanner input = new Scanner(System.in);

            String flippedCoin = number == 0 ? "Head" : "Tail";
            System.out.println("The coin is flipping ...");
            System.out.println("Please enter your guess:");
            String userGuess = input.next();
            if (userGuess.equalsIgnoreCase(flippedCoin)) {
                System.out.println("You are lucky. Your guess is correct.");

            } else {
                System.out.println("Sorry, you are loser. The correct one is " + flippedCoin);
            }

            System.out.println("do want play again?");
            answer = input.next();
            count++;
        }while (answer.equalsIgnoreCase("yes")&& count<5);

        System.out.println("Thank you for playing the game!");
    }


    }
