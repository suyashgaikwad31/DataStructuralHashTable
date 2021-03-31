package com.mylinkedhashmaptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyLinkedHashMapTest {
    @Test
    public void givenASentencesWhenWordAreAddedToListShouldReturnWordFrequency() {
        String sentence = "Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
           Integer value = myLinkedHashMap.get(word);
           if (value == null) value = 1;
           else value = value + 1;
           myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        Assertions.assertEquals(3, frequency);
    }
}
