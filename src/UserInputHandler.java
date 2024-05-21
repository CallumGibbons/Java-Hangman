import java.util.Scanner;

public class UserInputHandler {
    // Get a valid letter guess from the user
    public char getUserGuess(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Guess a letter: ");
            input = scanner.nextLine().trim().toUpperCase();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a single letter.");
            } else if (input.length() != 1) {
                System.out.println("Please enter a single letter.");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input. Please enter a letter.");
            } else {
                // Valid input received
                break;
            }
        }
        return input.charAt(0);
    }
}