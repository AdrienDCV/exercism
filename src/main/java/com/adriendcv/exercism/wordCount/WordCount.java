package com.adriendcv.exercism.wordCount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {


    public Map<String, Integer> phrase(String string) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] words = string.split(" ");
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
