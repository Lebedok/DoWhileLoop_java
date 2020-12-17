package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        // 12,6
        // we wil roll dices until some of the dice is equals to input
        //

        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 2 - 12");
        int number = input.nextInt();
        int sum;
        int count = 0;
        int balance = 100;



        //while the sum of the dice are equals to given  number then keep continue
        //to roll the dices
        // first roll the dices
        //then find the sum of dices
        //while sum is not equals to the number then roll again. Do this steps until
        //sum is equals to given number
        // -2 billion to + 2 billion


        do {
            int dice1 = random.nextInt(6);
            int dice2 = random.nextInt(6);
            sum = ++dice1 + ++dice2;
            System.out.println("Dice 1 is: " + dice1 +" Dice 2 is: " + dice2 );
            count++;

            if (count<=5 && sum==number) {
                balance += 200;
                System.out.println("You earned $200 ");
            }else{
                balance-=10;
                System.out.println("Balance is " + balance);
            }
        }while (sum!=number && count<5);

        System.out.println("You have rolled the dice " + count+ " times to find the "+ number);




    }
}
