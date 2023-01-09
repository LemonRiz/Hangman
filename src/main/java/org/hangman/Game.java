package org.hangman;

import static org.hangman.GameLogic.*;
import static org.hangman.Storage.selectWord;

public class Game {

    private static String word;


    static int lives = 7;
    static boolean gameWon = false;
    static char[] letters = new char[25];

    private static int index = 0;

    public static String getWord() {
        word = selectWord();
        return word;
    }

    public static void setLetters(char[] letters) {
        Game.letters = letters;
    }


    public static char[] getLetters() {
        return letters;
    }

    public static void addGuessLetter(char letter) {
        letters[index] = letter;
        index++;
    }

    static void guessCheck() {
        if (!letterChecker(word, letters[index - 1])) {
            lives--;
            System.out.println("Incorrect! You have " + Game.lives + " lives left");
        }

    }

//         need word to equal result of guesses
    static void winCheck() {
        if (wordComplete(word)) {
            gameWon = true;
        }
    }

    public static void play() {

        System.out.println("Welcome to HangMan!");
        System.out.println("You have " + Game.lives + " lives.");

        // Display the word with underscores replacing letters
        //Create a method that handles displaying the word
        System.out.println(replaceWord(getWord(), getLetters()));

        // implement getUserChar with while loop that runs as long as lives > 0 AND gameWon = false
        while (Game.lives > 0 && !gameWon)
            // we need to check if index is greater than 0
            if (index > 0) {
                System.out.println(replaceWord(word, getLetters()));
            }

        addGuessLetter(GameLogic.getUserChar());
        // need to check if user won via a method
        guessCheck();
        // was input letter correct

    }
}

