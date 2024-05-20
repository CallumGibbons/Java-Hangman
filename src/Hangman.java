import java.util.Scanner;

public class Hangman {
    private final GameState gameState;
    private final UserInputHandler inputHandler;

    public Hangman() {
        WordSelector wordSelector = new WordSelector();
        this.gameState = new GameState(wordSelector.selectRandomWord());
        this.inputHandler = new UserInputHandler();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameState.isGameOver()) {
            displayGameState();
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

        scanner.close();
    }

    private void displayGameState() {
        System.out.println("Word to guess: " + gameState.getGuessedWord());
        System.out.println("Tries left: " + gameState.getTriesLeft());
    }

    public static void main(String[] args){
        Hangman game = new Hangman();
        game.play();
    }
}
