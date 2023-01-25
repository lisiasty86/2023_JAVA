package Podstawy.Listy;

import java.util.*;

public class Zad5 {

    /**Napisz program, który zamienia liczbę całkowitą na liczbę w systemie binarnym.*/

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,6,8,23,54,4,3,105,1054,4567834));

        /** I */
        showBinaryStrings(numbers);

        /** II */
        System.out.println(stringToBinary(4567834));
    }

    /**rozwiazanie z uzyciem Integer.toBinaryString*/
    public static Map<Integer, Integer> showBinaryStrings (List<Integer> numbers) {
        Map<Integer, Integer> binariesNumbers = new HashMap<>();
//        for(Integer value : numbers) {
//            binariesNumbers.put(numbers.get(value), Integer.valueOf(Integer.toBinaryString(value)));
//        }

        for (int i=0;i<numbers.size();i++) {
            //binariesNumbers.put(numbers.get(i), Integer.valueOf(Integer.toBinaryString(numbers.get(i))));
            System.out.println("Liczba: " + numbers.get(i) + " ma nastepujaca wartosc binarna: " + Integer.toBinaryString(numbers.get(i)));
        }
        //System.out.println(binariesNumbers);
        return  binariesNumbers;
    }

    /**rozwiazanie ze stosem i StringBuilderem*/
    public static String stringToBinary(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.add(n % 2);
            //System.out.println(stack);
            n /= 2;
            //System.out.println(n);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
