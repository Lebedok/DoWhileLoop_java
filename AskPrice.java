package DoWhileLoop;

import java.util.Scanner;

public class AskPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("The phone price is $500. Please enter the amount:");
        double userInput = 0;

        do {
            userInput+=input.nextDouble();

        }while (userInput<500);

        System.out.println("Here is the phone!");

    }
}
