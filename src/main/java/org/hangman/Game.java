package org.hangman;

import static org.hangman.GameLogic.*;
import static org.hangman.Storage.selectWord;

public class Game {

    private String word;

    protected int lives = 7;
    private boolean gameWon = false;
    private char[] letters = new char[25];


    private static int index = 0;

    public String getWord() {
        word = selectWord();
        return word;
    }


    public char[] getLetters() {
        return letters;
    }

    public void addGuessLetter(char letter) {
        letters[index] = letter;
        index++;
    }

    void guessCheck() {
        if (!letterChecker(word, letters[index - 1])) {
            lives--;
            System.out.println("Incorrect! You have " + this.lives + " lives left.");
        }

    }

    //         need word to equal result of guesses
     void winCheck() {
        if (replaceWord(word, getLetters()).equals(word)) {
            gameWon = true;
        }
    }


    public void play() {

        System.out.println("Welcome to HangMan!");
        System.out.println("You have " + this.lives + " lives.");

        // Display the word with underscores replacing letters
        //Create a method that handles displaying the word
        System.out.println(replaceWord(getWord(), getLetters()));



        // implement getUserChar with while loop that runs as long as lives > 0 AND gameWon = false
        while (lives > 0 && !gameWon) {
            // we need to check if index is greater than 0
            if (index > 0) {
                System.out.println(replaceWord(word, getLetters()));
            }

            addGuessLetter(GameLogic.getUserChar("Enter your guess:"));
            System.out.println(letters);
            // need to check if user won via a method
            guessCheck();
            // was input letter correct
            winCheck();
        }
        if (lives == 0) {
            System.out.println("You lose! Game over!");
            System.out.println("The word was:" + word);

        } else {
            System.out.println(word);
            System.out.println("You win! Congratulations!");
        }

    }
}

