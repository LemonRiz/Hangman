package org.hangman;

import java.util.Scanner;


public class GameLogic {
    private static Scanner userInput = new Scanner(System.in);

    public static char getUserChar() {
        System.out.println("Enter your guess:");
        char letterInput = (userInput.next().charAt(0));
        return letterInput;
    }


    static String replaceWord(String word, char[] inputLetter) {
        String result = "";
        char[] convertedWord = word.toCharArray();
        for (char letter : convertedWord) {
            if (new String(inputLetter).contains("" + letter)) {
                result += letter;
            } else {
                result += "_ ";
            }
        }
        return result;
    }

    static boolean letterChecker(String word, char inputLetter) {
        System.out.println(inputLetter);
        boolean isLetterCorrect = false;
        if (word.contains("" + inputLetter)) {
            isLetterCorrect = true;
        }
        return isLetterCorrect;
    }

    static boolean wordComplete(String word, String result) {
        boolean isWordComplete = false;
        if(word == result){
            isWordComplete = true;
        }
        return isWordComplete;
    }
}

