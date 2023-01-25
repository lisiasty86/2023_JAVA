package Podstawy.Listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceLists {

    public static void main(String[] args) {
        List<Integer> arrayNumbers = new ArrayList<>();
        List<Integer> linkedNumbers = new LinkedList<>();

        //ArrayList add performance
        long startTimeArray = System.nanoTime();
        for (int i=0;i<1000000;i++) {
            arrayNumbers.add(i);
        }
        long endTimeArray = System.nanoTime();
        long durationArray = endTimeArray - startTimeArray;
        System.out.println("arrayList.add() performance: " + durationArray);


        //LinkedList add performance
        long startTimeLinked = System.nanoTime();
        for (int i=0;i<1000000;i++) {
            linkedNumbers.add(i);
        }
        long endTimeLinked = System.nanoTime();
        long durationLinked = endTimeLinked - startTimeLinked;
        System.out.println("linkedList.add() performance: " + durationLinked);

        //ArrayList remove performance
        long startTimeArrayRemove = System.nanoTime();
        for (int i=1000000-1;i>=0;i--) {
            arrayNumbers.remove(i);
        }
        long endTimeArrayRemove = System.nanoTime();
        long durationArrayRemove = endTimeArrayRemove - startTimeArrayRemove;
        System.out.println("arrayList.remove() performance: " + durationArrayRemove);


        //LinkedList remove performance
        long startTimeLinkedRemove = System.nanoTime();
        for (int i=1000000-1;i>=0;i--) {
            linkedNumbers.remove(i);
        }
        long endTimeLinkedRemove = System.nanoTime();
        long durationLinkedRemove = endTimeLinkedRemove - startTimeLinkedRemove;
        System.out.println("linkedList.remove() performance: " + durationLinkedRemove);

    }


}
