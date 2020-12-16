package DoWhileLoop;

import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {
       /* TASK:
        Using scanner ask user to provide one string value then print this
        string in following format. Add the X at the end of the String until
        string length is 20.
        "test"
        testX
        testXX
        testXXX
        testXXX 20time*/

        Scanner input = new Scanner (System.in);

        String str = input.nextLine();

        // while the length of the string is less than 20 than
        // add x the end of the string
        //testTheWhileLoopImplementation

        while (str.length()+1<20){
            str = str.concat("X");
            System.out.println(str);
        }


        String str1 = "testTheWhileLoopImplementation";
        int num = str1.length();

        while (num < 20){
            str1 = str1.concat("X");
            System.out.println(str1);
            num++;
        }












    }
}
