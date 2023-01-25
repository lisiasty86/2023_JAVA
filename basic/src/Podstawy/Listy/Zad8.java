package Podstawy.Listy;

import java.util.*;

public class Zad8 {

    /**Napisz metodę, która zwraca listę elementów w odwróconej kolejności.
     List <Integer> reverse( List <Integer>)*/

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        //Collection<Integer> numbers2 = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,4,6,8,9,11));


        System.out.println(reverse(numbers));
        System.out.println(numbers);
    }

    public static List<Integer> reverse (List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
        return numbers;
    }



}
