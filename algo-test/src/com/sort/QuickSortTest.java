package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 * //Divide and conquare
 *
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is using divide and conquer algorithm.
 * Quicksort first divides a large list into two smaller sub-lists: the low elements and the high elements.
 * Quicksort can then recursively sort the sub-lists.

 */
public class QuickSortTest {

    private int [] numbers;
    private int length;

    public static void main(String[] args)
    {
        //int[] toSort = {23,3,20,5, 40,8, 8, 5};

        QuickSortTest sorter = new QuickSortTest();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    private void sort(int[] values){
        numbers = values;
        length = values.length;
        quickSort(0, length - 1);

    }

    private void quickSort(int low, int high){
        int i = low, j= high;

        int pivot = numbers[low + (high - low)/2];

        while (i <= j){
            //left side
            while ( numbers[i] < pivot){
                i ++;
            }

            //right side
            while (numbers[j] > pivot){
                j--;
            }

            // value of left of pevot is higher and right is lower then the pivot, then exchange
            if(i <= j){
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j){
            quickSort(low, j);
        }
        if(i < high){
            quickSort(i, high);
        }

    }
    private void exchange(int i, int j){
        int temp = numbers[i];
        numbers[i]= numbers[j];
        numbers[j] = temp;
    }

}
