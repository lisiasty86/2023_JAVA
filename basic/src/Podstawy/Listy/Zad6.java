package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad6 {

    /**Napisz program, który tworzy przykładową ArrayListę zawierającą kolory. Wypisz
     wszystkie utworzone kolory.*/
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.addAll(Arrays.asList("blue", "red", "pink", "black", "white"));

        printColours(colours);
    }

    public static void printColours (List<String> colours) {
/*        for (int i=0;i<colours.size();i++) {
            System.out.println(colours.get(i));
        }*/
        for (String value : colours) {
            System.out.println(value);
        }
    }

}
