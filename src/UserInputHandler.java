import java.util.Scanner;

public class UserInputHandler {
    public char getUserGuess(Scanner scanner) {
        System.out.print("Guess a letter: ");
        return scanner.next().toUpperCase().charAt(0);
    }
}