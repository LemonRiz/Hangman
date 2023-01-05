package org.hangman;

import static org.hangman.Storage.selectWord;

public class Main {
    public static void main(String[] args) {
        Storage wordList = new Storage();

        String word = selectWord();
        String replaced = word.replaceAll(".", "_ ");
        System.out.println(replaced);
    }

}
