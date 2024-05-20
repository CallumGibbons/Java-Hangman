import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordSelector {
    private final Scanner scanner;

    public WordSelector() {
        try {
            scanner = new Scanner(new File("C:\\Users\\Callum\\nology\\Yuma\\Java\\Hangman\\src\\words.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String selectRandomWord() {
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        Random rand = new Random();
        String selectedWord = words.get(rand.nextInt(words.size()));
        return selectedWord.toUpperCase();
    }
}
