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
            guessedWord.add('_');
        }
        this.guessedLetters = new ArrayList<>();
        this.triesLeft = 6;
    }

    public boolean isGameOver() {
        return triesLeft <= 0 || isWordGuessed();
    }
    public boolean isWordGuessed() {
        return !guessedWord.contains('_');
    }
    public boolean isLetterGuessed(char letter) {
        return guessedLetters.contains(letter);
    }
    public void guessLetter(char letter) {
        guessedLetters.add(letter);

        if (wordToGuess.indexOf(letter) >= 0) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedWord.set(i, letter);
                }
            }
            System.out.println("Correct guess!");
        } else {
            triesLeft--;
            System.out.println("Wrong guess.");
        }
    }
    public String getWordToGuess() {
        return wordToGuess;
    }

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
}
