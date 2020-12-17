package DoWhileLoop;

import java.util.Scanner;

public class digitNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");

        int num = input.nextInt();
        int sum = 0;
        int multiple = 1;



        while (num>0) {
           int digit = num % 10;
           sum+=digit;
           multiple *=digit;

            System.out.println(digit);
            num /= 10;
        }

        System.out.println(sum);
        System.out.println(multiple);






        }
    }

