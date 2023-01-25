package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad13 {

    /**Napisz metodę, która zwraca liczbę różnych słów występujących w liście.
     int getNumberDifferentWords(List<String> words);*/

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("dog", "cat", "house", "house", "dog", "house", "cat", "moto", "moto"));

        System.out.println(getNumberDifferentWords(words));
    }

    public static int getNumberDifferentWords(List<String> words) {
        int count = 1;
        String firstWord = words.get(0);
        List<String> helper = new ArrayList<>();
            for (String value : words) {
                if (!firstWord.equals(value)) {
                    if (!helper.contains(value)) {
                        helper.add(value);
                        count++;
                    }
                }
            }
        return count;
    }

}
