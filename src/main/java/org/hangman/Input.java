package org.hangman;

import java.util.Scanner;


public class Input {
    private static Scanner userInput = new Scanner(System.in);

    public char getUserChar() {
        char letterInput = userInput.next().charAt(0);
        return letterInput;
    }
}
