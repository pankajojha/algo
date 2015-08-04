package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 * Bubble sort, also referred to as sinking sort, is a simple sorting algorithm that works by repeatedly stepping through the
 * list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the
 * list is repeated until no swaps are needed, which indicates that the list is sorted. The algorithm gets its name from the way smaller
 * elements "bubble" to the top of the list. Because it only uses comparisons to operate on elements, it is a comparison sort.
 * Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        BubbleSortTest sorter = new BubbleSortTest();
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};

        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private void sort(int[] arr) {
        int len = arr.length;
        int k;
        for (int i = len; i > 0; i--) {
            for (int j = 0; j < len - 1; j++) {
                k = j + 1;
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

}
