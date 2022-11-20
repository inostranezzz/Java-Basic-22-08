package org.example;

import java.util.*;

public class SelectionSort {
    private static final int COUNT = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(generateRandomArrayInt(COUNT));
        System.out.println(list);

        List<Integer> listSelectionSort = new ArrayList<>();
        listSelectionSort.addAll(list);
        long start = new Date().getTime();
        selectionSort(listSelectionSort);
        long end = new Date().getTime();
        System.out.println(listSelectionSort);
        System.out.println("Selected sort: " + (end - start) + " ms");

        List<Integer> listCollectionSort = new ArrayList<>();
        listCollectionSort.addAll(list);
        start = new Date().getTime();
        Collections.sort(listCollectionSort);
        end = new Date().getTime();
        System.out.println(listCollectionSort);
        System.out.println("Quick sort: " + (end - start) + " ms");
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

    private static void selectionSort(List<Integer> array){
        for(int i = 0; i < array.size() - 1; i++){
            int minIndexPosition = i;
            int previousMinValue = array.get(i);
            for(int j = i+1; j < array.size(); j++){
                if(array.get(minIndexPosition) > array.get(j)){
                    minIndexPosition = j;
                }
            }
            array.set(i, array.get(minIndexPosition));
            array.set(minIndexPosition, previousMinValue);
        }
    }
}
