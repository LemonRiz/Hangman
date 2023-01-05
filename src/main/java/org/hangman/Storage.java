package org.hangman;

import java.util.ArrayList;
import java.util.Random;

public class Storage {
    private static ArrayList<String> words = new ArrayList<>();

    private static final Random random = new Random();

    static {
        words.add("attraction");
        words.add("biology");
        words.add("chemical");
        words.add("diving");
        words.add("elephant");
        words.add("farming");
        words.add("gravity");
        words.add("hologram");
        words.add("individual");
    }

    public static String selectWord() {
        String challenge = words.get(random.nextInt(words.size()));
        return challenge.toLowerCase();
    }

}
