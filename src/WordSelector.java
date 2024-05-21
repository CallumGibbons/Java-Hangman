import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSelector {
    private final List<String> words;

    public WordSelector() {
        words = new ArrayList<>();
        try {
            // Attempt to read words from the file
            Scanner scanner = new Scanner(new File("C:\\Users\\Callum\\nology\\Yuma\\Java\\Hangman\\src\\words.txt"));
            while (scanner.hasNext()) {
                words.add(scanner.nextLine().trim().toUpperCase());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // If the file is not found, use a default list of 100 words.
            String[] defaultWords = {
                    "EXAMPLE", "HANGMAN", "PROGRAMMING", "JAVA", "GAME",
                    "COMPUTER", "SCIENCE", "CODE", "DEVELOPER", "SOFTWARE",
                    "HARDWARE", "KEYBOARD", "MONITOR", "MOUSE", "SCREEN",
                    "PROCESSOR", "MEMORY", "STORAGE", "NETWORK", "INTERNET",
                    "BROWSER", "DATABASE", "SERVER", "CLIENT", "APPLICATION",
                    "FUNCTION", "VARIABLE", "CLASS", "OBJECT", "METHOD",
                    "ATTRIBUTE", "PARAMETER", "INTERFACE", "INHERITANCE", "POLYMORPHISM",
                    "ABSTRACTION", "ENCAPSULATION", "DEBUGGING", "COMPILER", "INTERPRETER",
                    "SYNTAX", "SEMANTICS", "ALGORITHM", "DATA", "STRUCTURE",
                    "QUEUE", "STACK", "LIST", "ARRAY", "HASHMAP",
                    "GRAPH", "TREE", "BINARY", "SEARCH", "SORT",
                    "RECURSION", "ITERATION", "CONDITIONAL", "LOOP", "BREAK",
                    "CONTINUE", "RETURN", "SWITCH", "CASE", "DEFAULT",
                    "EXCEPTION", "ERROR", "THROW", "CATCH", "FINALLY",
                    "TRY", "MULTITHREADING", "SYNCHRONIZATION", "CONCURRENCY", "PARALLELISM",
                    "ASYNCHRONOUS", "SYNCHRONOUS", "EVENT", "LISTENER", "CALLBACK",
                    "OBSERVABLE", "OBSERVER", "MODEL", "VIEW", "CONTROLLER",
                    "DATABASE", "QUERY", "TABLE", "COLUMN", "ROW",
                    "PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "INDEX",
                    "TRANSACTION", "COMMIT", "ROLLBACK", "SAVEPOINT", "LOCK"
            };
            Collections.addAll(words, defaultWords);
        }
    }

    public String selectRandomWord() {
        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
}
