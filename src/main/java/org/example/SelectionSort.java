package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {
    private static final int COUNT = 100;

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        System.out.println(generateRandomArrayInt(COUNT));



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
