package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad9 {

    /**Napisz metodę, która zwraca maksymalny element Listy.
     int getMax(List<Integer>)*/

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,4,7,2,100,54,34435,22,347,9865));

        //getMax(number);
        System.out.println(getMax(number));
    }

    public static int getMax (List<Integer> numbers) {
        int maxValue=0;
        for (int i=0;i<numbers.size();i++) {
            if (numbers.get(i) > maxValue) {
                maxValue = numbers.get(i);
            }
        }
        return maxValue;
    }

}
