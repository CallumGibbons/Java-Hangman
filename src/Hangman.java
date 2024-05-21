import java.util.Scanner;

public class Hangman {
    private final UserInputHandler inputHandler;

    public Hangman() {
        this.inputHandler = new UserInputHandler();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        do {
            // Initialize a new game state with a randomly selected word
            WordSelector wordSelector = new WordSelector();
            GameState gameState = new GameState(wordSelector.selectRandomWord());

            // Main game loop
            while (!gameState.isGameOver()) {
                displayGameState(gameState);
                char guess = inputHandler.getUserGuess(scanner);

                // Check if the letter has already been guessed
                if (gameState.isLetterGuessed(guess)) {
                    System.out.println("You have already guessed that letter. Try again.");
                    continue;
                }

                // Process the guessed letter
                gameState.guessLetter(guess);
            }

            // Display game result
            if (gameState.isWordGuessed()) {
                System.out.println("Congratulations! You guessed the word: " + gameState.getWordToGuess());
            } else {
                System.out.println("Sorry, you've run out of tries. The word was: " + gameState.getWordToGuess());
            }
        } while (shouldPlayAgain(scanner));  // Prompt the user to play again

        scanner.close();
    }

    // Display the current state of the game
    private void displayGameState(GameState gameState) {
        System.out.println("Word to guess: " + gameState.getGuessedWord());
        System.out.println("Tries left: " + gameState.getTriesLeft());
        System.out.println("Guessed letters: " + gameState.getGuessedLetters());
        displayHangman(gameState.getTriesLeft());
    }

    // Prompt the user to decide if they want to play again
    private boolean shouldPlayAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
    // Display the hangman drawing based on the number of tries left
    private void displayHangman(int triesLeft) {
        String[] hangmanStages = {
                "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========= ",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n========= ",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n========= ",
                "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n========= ",
                "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n========= ",
                "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n========= ",
                "  +---+\n  |   |\n      |\n      |\n      |\n      |\n========= ",
        };
        System.out.println(hangmanStages[triesLeft]);
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.play();
    }
}
