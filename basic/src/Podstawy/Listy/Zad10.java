package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad10 {

    /**Napisz program, który utworzy przykładową LinkedList liczb całkowitych
     (conajmniej 5 elementów). Do utworzonej listy dodaj element na indeksie numer
     2.*/

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,4,5,7,2,3,9));

        numbers.add(5, 22);

        System.out.println(numbers);
    }

}
