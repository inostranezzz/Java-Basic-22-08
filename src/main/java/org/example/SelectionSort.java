package org.example;

import java.util.*;

public class SelectionSort {
    private static final int COUNT = 10000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(generateRandomArrayInt(COUNT));
        System.out.println(list);

        List<Integer> listSelectionSort = new ArrayList<>();
        listSelectionSort.addAll(list);

        List<Integer> listCollectionSort = new ArrayList<>();
        listCollectionSort.addAll(list);
        long start = new Date().getTime();
        Collections.sort(listCollectionSort);
        long end = new Date().getTime();
        System.out.println(listCollectionSort);
        System.out.println("delta " + (end - start) + " ms");



    }

    private static List<Integer> generateRandomArrayInt(int count){
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        while (count!=0) {
            int intRandom = random.nextInt(count);
            boolean isNegativeNumber = random.nextBoolean();
            if (isNegativeNumber){
                intRandom  = - intRandom;
            }
            randomList.add(intRandom);
            count--;
        }
        return randomList;
    }
}