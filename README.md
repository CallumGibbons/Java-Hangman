Hangman Game
This is a simple Hangman game implemented in Java. The game selects a random word and allows the player to guess letters to reveal the word. The player has a limited number of attempts to guess the word correctly. As wrong guesses are made, a hangman is progressively drawn.

Features
- Random word selection from a file or a default list of words.
- User-friendly prompts and input validation.
- Progressive hangman drawing as attempts are used.
- Option to play again after the game ends.


Classes and Responsibilities

Hangman

- Initializes the game and handles user input.
- Displays the current game state and hangman drawing.
- Prompts the user to play again.


GameState

- Stores the word to guess, guessed letters, and remaining tries.
- Handles letter guesses and updates the game state.
- Checks if the game is over or if the word has been guessed.


UserInputHandler

- Prompts the user for a letter guess.
- Validates the input to ensure it is a single letter.
  
WordSelector

- Reads words from a specified file.
- Falls back to a default list of words if the file is not found.
