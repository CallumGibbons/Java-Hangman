import java.util.ArrayList;
import java.util.List;

public class GameState {
    private String wordToGuess;
    private List<Character> guessedWord;
    private List<Character> guessedLetters;
    private int triesLeft;

    public GameState(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.add('_');
        }
        this.guessedLetters = new ArrayList<>();
        this.triesLeft = 6;
    };
}
