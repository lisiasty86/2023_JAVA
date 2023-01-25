package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad2 {

    /**Napisz metodę, która dla danej listy zwraca nową posortowaną listę.
     List<Integer> getSortedList(List<Integer> numbers);*/

    public static void main(String[] args) {

        List<Integer> randomNumber = new ArrayList<>();
        randomNumber.add(6);
        randomNumber.add(5);
        randomNumber.add(3);
        randomNumber.add(10);
        randomNumber.add(1);
        randomNumber.add(2);
        randomNumber.add(8);
        List<Integer> randomNumber2 = new ArrayList<>();
        randomNumber2.addAll(Arrays.asList(1,4,7,2,100,54,34435,22,347,9865));

        getSortedList(randomNumber);
        getSortedList(randomNumber2);
    }

    public static List<Integer> getSortedList (List<Integer> number) {
        int tmp;
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < number.size(); j++) {
                if (number.get(i) < number.get(j)) {
                    tmp = number.get(i);
                    number.set(i, number.get(j));
                    number.set(j, tmp);
                }
            }
        }
        System.out.println(number);
        return number;
    }
}
