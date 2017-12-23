package com.tamco.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {0, 2, 5, 6, 9, 1, 5, 9, 9, 9};
        merge(array, 0, 4, 9);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] items, int low, int mid, int high) {

        int[] aux = new int[high - low + 1];
        for (int i = low; i <= high; i++) {
            aux[i - low] = items[i];
        }

        int i = 0, j = mid - low + 1;
        int index = low;

        while (index <= high) {
            if (i >= mid - low + 1) {
                items[index] = aux[j];
                j++;
                index++;
                continue;
            }

            if (j >= high - low + 1) {
                items[index] = aux[i];
                i++;
                index++;
                continue;
            }

            if (aux[i] <= aux[j]) {
                items[index] = aux[i];
                i++;

            } else {
                items[index] = aux[j];
                j++;
            }
            index++;
        }
    }
}
