package org.hangman;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        while (true) {

            Game game = new Game();
            game.play();

           char replay = GameLogic.getUserChar("Do you want to play again? Y/N");
           if (replay != 'Y') {
               break;
           }

        }
    }
}
