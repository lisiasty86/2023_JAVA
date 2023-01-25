package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad11 {

    /**Napisz program z przykładową LinkedList liczb całkowitych. Zamień element 0 i 2
     Listy.*/

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,4,7,8,9,2,4,12,234,765));

        Collections.swap(numbers, 0, 2);

        /** reczna zamiana miejsc
         int temp;
        temp = numbers.get(0);
        numbers.remove(0);
        numbers.add(0, numbers.get(1));
        numbers.remove(2);
        numbers.add(2, temp);*/

        System.out.println(numbers);
    }

}
