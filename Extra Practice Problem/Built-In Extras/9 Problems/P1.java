import java.util.*;

public class P1 { //NumberGuessingGame
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;

        System.out.println("Guess any number from 1 to 100 in your mind and follow the game.");

        while (true) {
            int r = (int) (Math.random() * (high-low) + low);
            System.out.println("Random guess: " +r);
            System.out
                    .println("Now, if the number you guessed is same as Random guess by system then type \"correct\" ");
            System.out.println(
                    "But, if ypur number is low or high as compared to the Random guess by system then type \"low\" or \"high\" respectively.");
            String input = sc.next();

            while (true) {

                if (!input.equals("low") && !input.equals("high") && !input.equals("correct")) {
                    System.out.println("Invalid Input! Enter again.");
                    input = sc.next();
                }else{
                    break;
                }
            }

            if (input.equals("correct")) {
                break;
            } else if (input.equals("low")) {
                high = r;
            } else if (input.equals("high")) {
                low = r;
            }
            System.out.println("Guessing Again!");

        }
        System.out.println("Mubarak ho! I guessed it right!");

        sc.close();
    }
}