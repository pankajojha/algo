package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 *
 * During the Mergesort process the object in the collection are divided into two collections. To split a collection, Mergesort will take the middle of the collection and split the collection into its left and its right part.

 The resulting collections are again recursively sorted via the Mergesort algorithm.

 Once the sorting process of the two collections is finished, the result of the two collections is combined. To combine both collections Mergesort start at each collection at the beginning. It pick the object which is smaller and inserts this object into the new collection. For this collection it now selects the next elements and selects the smaller element from both collection.

 Once all elements from both collections have been inserted in the new collection, Mergesort has successfully sorted the collection.


 */
public class MergeSortTest {

    //divide and conqure
    private int[] numbers;
    private int[] helper;
    private int number;


    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] inputArray = {45, 23, 89, 98, 4, 28, 65, 53, 7, 20};

        MergeSortTest mergeSortTest = new MergeSortTest();
        mergeSortTest.sort(inputArray);
        for (int i : inputArray) {
            System.out.println(" i " + i);
        }
    }

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
