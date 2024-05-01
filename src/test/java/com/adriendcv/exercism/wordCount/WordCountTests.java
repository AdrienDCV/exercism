package com.adriendcv.exercism.wordCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
    void shouldReturnAMapContainingASingleKeyAndAItsValue() {
        actualWordCount = wordCount.phrase("test");

        Assertions.assertEquals(false, actualWordCount.isEmpty());
        Assertions.assertEquals(1, actualWordCount.size());
        Assertions.assertEquals(1, actualWordCount.keySet().size());
        Assertions.assertEquals(1, actualWordCount.values().size());
    }

    @Test
    void shouldReturnAMapContainingASingleKeyAndAItsValueEqualToOne() {
        actualWordCount = wordCount.phrase("test");

        Assertions.assertEquals(1, actualWordCount.get("test"));
    }

    @Test
    void shouldReturnAMapContainingASingleKeyGivenAsAParameterAndAItsValueEqualToOne() {
        actualWordCount = wordCount.phrase("test");

        Assertions.assertEquals(true, actualWordCount.containsKey("test"));
        Assertions.assertEquals(1, actualWordCount.get("test"));
    }

    @Test
    void shouldReturnAMapContainingSeveralKeysGivenAsAStringInParameterAndATheirValuesEqualToOne() {
        actualWordCount = wordCount.phrase("phrase de test");

        Assertions.assertEquals(3, actualWordCount.size());
        Assertions.assertEquals(1, actualWordCount.get("phrase"));
        Assertions.assertEquals(1, actualWordCount.get("de"));
        Assertions.assertEquals(1, actualWordCount.get("test"));
    }

    @Test
    void shouldReturnAMapContainingSeveralKeysGivenAsAStringInParameterAndTheirValuesEqualsToTheNumberOfAppearanceOfTheRelatedKey() {
        actualWordCount = wordCount.phrase("Bonjour je suis Adrien et je suis en BUT Informatique");

        Assertions.assertEquals(2, actualWordCount.get("je"));
        Assertions.assertEquals(2, actualWordCount.get("suis"));
        Assertions.assertEquals(1, actualWordCount.get("Adrien"));
    }

}
