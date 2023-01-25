package Podstawy.Listy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Zad4 {

    /**Napisz program, który symuluje działanie słownika polsko-angielskiego.
     Przykładowy program:
     Podaj słówko po Polsku:
     mama
     Słówko po Angielsku to mother.*/

    public static void main(String[] args) {

        Map<String, String> slownik = new HashMap<>();
        slownik.put("kot", "cat");
        slownik.put("pies", "dog");
        slownik.put("dom", "house");
        slownik.put("mama", "mother");
        slownik.put("corka", "daughter");
        slownik.put("tata", "dad");
        slownik.put("samochod", "car");


        Scanner scanner = new Scanner(System.in);
        //String polishWord = scanner.next().toLowerCase(Locale.ROOT);

        String end = "end";

         for (;;) {
             System.out.println("Podaj slowo:");
             String polishWord = scanner.next().toLowerCase(Locale.ROOT);

             if (slownik.containsKey(polishWord)) {
                 System.out.println(slownik.get(polishWord));
             } else if(polishWord.equals(end)) {
                 System.out.println("nara");
             } else {
                 System.out.println("nie ma takiego slowa");
             }

             if (polishWord.equals(end)) {
                 break;
             }
         }

    }



}
