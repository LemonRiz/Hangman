package org.hangman;

import static org.hangman.GameLogic.*;
import static org.hangman.Storage.selectWord;

public class Game {

    static int lives = 7;
    static boolean gameWon = false;
    static char[] letters = new char[25];

    public static void setLetters(char[] letters) {
        Game.letters = letters;
    }

    public static char[] getLetters() {
        return letters;
    }

    public static void play() {
        // Get word
        String word = selectWord();

        System.out.println("Welcome to HangMan!");
        System.out.println("You have " + Game.lives + " lives.");

        // Display the word with underscores replacing letters
        //Create a method that handles displaying the word
        System.out.println(replaceWord(word, getLetters()));

        // implement getUserChar with while loop that runs as long as lives > 0 AND gameWon = false
        while (Game.lives != 0 && !gameWon) {
            String guess = GameLogic.getUserChar();
            if (word.contains(guess)){

            }
        }
    }
}
