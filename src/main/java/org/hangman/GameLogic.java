package org.hangman;

import java.util.Scanner;


public class GameLogic {
    private static Scanner userInput = new Scanner(System.in);

    public static String getUserChar() {
        System.out.println("Enter your guess:");
        String letterInput = String.valueOf(userInput.next().charAt(0));
        return letterInput;
    }


   static String replaceWord(String word, char[] inputLetter){
        String result = "";
       char[] convertedWord = word.toCharArray();
       for ( char letter : convertedWord ){
           if(new String(inputLetter).contains("" + letter)) {
               result += letter;
           }
           else {
               result += "_ ";
           }
       }
       return result;
   }


}
