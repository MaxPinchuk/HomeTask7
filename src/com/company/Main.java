package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size = 50_000;

        int max = 10_000;
        int min = -10_000;

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            int random = (int) (Math.random() * (max - min)) + min;
            arr1[i] = random;
        }
        arr2 = Arrays.copyOf(arr1, arr1.length);

        long time = System.currentTimeMillis();
        bubbleSort(arr1);
        System.out.println("Sorted by bubble: " + (System.currentTimeMillis() - time) + "ms");

        time = System.currentTimeMillis();
        Arrays.sort(arr2);
        System.out.println("Sorted by Arrays: " + (System.currentTimeMillis() - time) + "ms");

    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
