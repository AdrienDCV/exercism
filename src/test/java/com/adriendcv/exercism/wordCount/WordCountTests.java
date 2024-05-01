package com.adriendcv.exercism.wordCount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCountTests {
    
    Map<String, Integer> actualWordCount;
    Map<String, Integer> expectedWordCount;
    WordCount wordCount;

    @BeforeEach
    void beforeEachTest() {
        actualWordCount = new HashMap<>();
        expectedWordCount = new HashMap<>();
        wordCount = new WordCount();
    }

    @Test
    void shouldReturnAMapOfOneWordAndItsCounterEqualToOne() {
        actualWordCount = wordCount.phrase("test");

        Assertions.assertEquals(1, actualWordCount.size());
        Assertions.assertEquals(1, actualWordCount.get("test"));
        Assertions.assertEquals(true, actualWordCount.containsKey("test"));
    }

    @Test
    void shouldReturnAMapOfAnyWordOfAPhraseAndTheirCountersEqualToOne() {
        actualWordCount = wordCount.phrase("phrase de test");

        Assertions.assertEquals(3, actualWordCount.size());
        Assertions.assertEquals(1, actualWordCount.get("phrase"));
        Assertions.assertEquals(1, actualWordCount.get("de"));
        Assertions.assertEquals(1, actualWordCount.get("test"));
        Assertions.assertEquals(true, actualWordCount.containsKey("phrase"));
        Assertions.assertEquals(true, actualWordCount.containsKey("de"));
        Assertions.assertEquals(true, actualWordCount.containsKey("test"));
    }

    @Test
    void shouldIncrementCounterIfAWordIsPresentSeveralTimes() {
        actualWordCount = wordCount.phrase("Bonjour je suis Adrien je suis en BUT Informatique");

        Assertions.assertEquals(1, actualWordCount.get("Bonjour"));
        Assertions.assertEquals(2, actualWordCount.get("je"));
        Assertions.assertEquals(2, actualWordCount.get("suis"));
    }

}
