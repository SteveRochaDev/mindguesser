import java.util.Scanner;
import java.util.Random;

public class MindGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to MindGuesser!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
