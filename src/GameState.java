import java.util.ArrayList;
import java.util.List;

public class GameState {
    private final String wordToGuess;
    private final List<Character> guessedWord;
    private final List<Character> guessedLetters;
    private int triesLeft;

    public GameState(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.add('_');  // Initialize the guessed word with underscores
        }
        this.guessedLetters = new ArrayList<>();
        this.triesLeft = 6;  // Set the initial number of tries
    }

    // Check if the game is over
    public boolean isGameOver() {
        return triesLeft <= 0 || isWordGuessed();
    }
    // Check if the entire word has been guessed
    public boolean isWordGuessed() {
        return !guessedWord.contains('_');
    }
    // Check if a letter has already been guessed
    public boolean isLetterGuessed(char letter) {
        return guessedLetters.contains(letter);
    }
    // Process the guessed letter
    public void guessLetter(char letter) {
        guessedLetters.add(letter);

        if (wordToGuess.indexOf(letter) >= 0) {
            // Correct guess, update the guessed word
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedWord.set(i, letter);
                }
            }
            System.out.println("Correct guess!");
        } else {
            // Wrong guess, decrement the number of tries left
            triesLeft--;
            System.out.println("Wrong guess.");
        }
    }
    public String getWordToGuess() {
        return wordToGuess;
    }

    // Return the current state of the guessed word
    public String getGuessedWord() {
        StringBuilder result = new StringBuilder();
        for (Character c : guessedWord) {
            result.append(c);
        }
        return result.toString();
    }

    public int getTriesLeft() {
        return triesLeft;
    }

    // Return the list of guessed letters
    public List<Character> getGuessedLetters() {
        return guessedLetters;
    }
}
