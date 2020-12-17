package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // random class --> it will create random number

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        // This random class will generate the random number between 0 to 100
        Scanner input = new Scanner(System.in);
        int number = 0;
        int count = 0;

        do {
            System.out.println("Please guess the number between 0 - 100");
             number = input.nextInt();

            if (number<randomNumber){

                System.out.println("The number is less than random number");
            }else{
                System.out.println("The number is bigger than random number");
            }
        }while (number !=randomNumber && count <5);
        System.out.println("The number is  " + randomNumber);
    }


}
