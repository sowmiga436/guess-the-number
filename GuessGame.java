import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int tries = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter guess: ");
            guess = scanner.nextInt();
            tries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + tries + " tries.");
            }
        } while (guess != numberToGuess);
    }
}
