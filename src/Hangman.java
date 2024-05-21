import java.util.Scanner;

public class Hangman {
    private final UserInputHandler inputHandler;

    public Hangman() {
        this.inputHandler = new UserInputHandler();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        do {
            WordSelector wordSelector = new WordSelector();
            GameState gameState = new GameState(wordSelector.selectRandomWord());

            while (!gameState.isGameOver()) {
                displayGameState(gameState);
                char guess = inputHandler.getUserGuess(scanner);

                if (gameState.isLetterGuessed(guess)) {
                    System.out.println("You have already guessed that letter. Try again.");
                    continue;
                }

                gameState.guessLetter(guess);
            }

            if (gameState.isWordGuessed()) {
                System.out.println("Congratulations! You guessed the word: " + gameState.getWordToGuess());
            } else {
                System.out.println("Sorry, you've run out of tries. The word was: " + gameState.getWordToGuess());
            }
        } while (shouldPlayAgain(scanner));

        scanner.close();
    }

    private void displayGameState(GameState gameState) {
        System.out.println("Word to guess: " + gameState.getGuessedWord());
        System.out.println("Tries left: " + gameState.getTriesLeft());
        System.out.println("Guessed letters: " + gameState.getGuessedLetters());
    }

    private boolean shouldPlayAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.play();
    }
}
