package com.adriendcv.exercism.wordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {


    public Map<String, Integer> phrase(String phrase) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] words = phrase.split(" ");
        for (int idx = 0; idx < words.length; idx++) {
            if (wordsCount.containsKey(words[idx])) {
                wordsCount.put(words[idx], wordsCount.get(words[idx]) + 1);
            } else {
                wordsCount.put(words[idx], 1);
            }
        }
        return wordsCount;
    }
}
