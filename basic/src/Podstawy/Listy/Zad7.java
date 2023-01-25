package Podstawy.Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad7 {

    /**Napisz implementacje następującej metody::
     int findIndexOfColor(String color, List <String> colors)
     Metoda powinna zwracać index na którym występuje dany kolor w liście bądź -1
     jeśli taki kolor nie występuje w liście.*/

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("blue", "red", "pink", "black", "white"));

        System.out.println(findIndexOfColor("dupa", colors));

    }

    public static int findIndexOfColor(String color, List<String> colors) {
       /* int colorIndex = 0;
        for (int i=0;i<colors.size();i++) {
            if(colors.get(i).equals(color)){
                colorIndex = i;
            }
        }
        return colorIndex;*/
        return colors.indexOf(color);
    }

}
