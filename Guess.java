import java.util.*;

class Guess { // start if class loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); // taking a Random Variable
        int low = 1, high = 100, i;
        int num = r.nextInt(high - low) + low;
        System.out.println("You Got 10 Attempts to make a Guess!!");
        for (i = 1; i < 10; i++) {
            System.out.println("Enter a guess"); // taking a Guess from User
            int num1 = sc.nextInt();
            if (num == num1) // Checking the Guessed Number Matches the Random Number
            {
                System.out.println("Right guess :)");
                System.out.println("Your Score is:" + " " + i);
                break;
            } else if (num1 > num) {
                System.out.println("Make a Smaller Guess!!");
            } else {
                System.out.println("Make a Higger Guess!!");
            }
        }
        if (i == 10) // Displaying the Score
            System.out.println("Sorry! , You couldnt guess the number in 10 attempts ");
    }
}