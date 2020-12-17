package DoWhileLoop;

public class FirstExample {

    public static void main(String[] args) {

        //Want to print "Chicago" 5 times using do while loop

        int count = 1;

        do {
            System.out.println("Chicago");
            count++;

        }while (count<=5);

        System.out.println(count); // 7


        int num = 6;

        while (num<5){
            System.out.println("Illinois");
            num++;
        }

        System.out.println(num); // num will be 6 bc while condition is false


    }
}
