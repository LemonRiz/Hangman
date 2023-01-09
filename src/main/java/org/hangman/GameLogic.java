package org.hangman;

import java.util.Scanner;


public class GameLogic {
    private static Scanner userInput = new Scanner(System.in);

    public static char getUserChar (String message) {
        System.out.println(message);
        char letterInput = (userInput.nextLine().charAt(0));
        return Character.toLowerCase(letterInput);
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
        boolean isLetterCorrect = word.contains("" + inputLetter);
        return isLetterCorrect;
    }

}

