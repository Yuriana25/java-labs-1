package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sizeElement = 100000;
        int elementToInsert = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Кількість елементів у списку: " + sizeElement);
        System.out.println("Число введених елементів: " + elementToInsert);

        fill(arrayList, sizeElement, "ArrayList");
        fill(linkedList, sizeElement, "LinkedList");

        randomAccess(arrayList, "ArrayList");
        randomAccess(linkedList, "LinkedList");

        sequentialAccess(arrayList, "ArrayList");
        sequentialAccess(linkedList, "LinkedList");

        insertAtBeginning(arrayList, elementToInsert, "ArrayList");
        insertAtBeginning(linkedList, elementToInsert, "LinkedList");

        insertAtEnd(arrayList, elementToInsert, "ArrayList");
        insertAtEnd(linkedList, elementToInsert, "LinkedList");

        insertInMiddle(arrayList, elementToInsert, "ArrayList");
        insertInMiddle(linkedList, elementToInsert, "LinkedList");
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(count));
        }
        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, String listType){
        long time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
        }
        System.out.printf("Random access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void sequentialAccess(List<Integer> list, String listType){
        long time = System.currentTimeMillis();
        for (Integer element : list) {
            int value = element;
        }
        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtBeginning(List<Integer> list, int elementToInsert, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < elementToInsert; i++) {
            list.add(0, i);
        }
        System.out.printf("Insert in the beginning of %s: %d ms%n", listType, System.currentTimeMillis() - time);

    }

    private static void insertAtEnd(List<Integer> list, int elementToInsert, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < elementToInsert; i++) {
            list.add(i);
        }
        System.out.printf("Insert in the end of %s: %d ms%n", listType, System.currentTimeMillis() - time);

    }

    private static void insertInMiddle(List<Integer> list, int elementToInsert, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < elementToInsert; i++) {
            int index = list.size() / 2;
            list.add(index, i);
        }
        System.out.printf("Insert in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - time);

    }
}

