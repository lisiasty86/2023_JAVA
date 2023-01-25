package Podstawy.Listy;

import java.util.*;

public class Zad12 {

    /**Napisz metodę, która konwertuje LinkedList do ArrayListy.*/

    public static void main(String[] args) {
        List<Integer> linkedNumbers = new LinkedList<>();
        linkedNumbers.addAll(Arrays.asList(1,4,6,7,3,5,6,8,10));

        converter(linkedNumbers);
    }

    public static ArrayList<Integer> converter (List<Integer> linkedNumbers) {
        List<Integer> arrayNumbers = new ArrayList<>();
        //Collections.addAll(linkedNumbers, arrayNumbers);
        for (Integer value : linkedNumbers) {
            arrayNumbers.add(value);
        }
        System.out.println(arrayNumbers);
       return null;
    }
}
