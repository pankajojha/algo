package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 *
 * Insertion sort is a simple sorting algorithm, it builds the final sorted array one item at a time. It is much less efficient on large
 * lists than other sort algorithms.

 */
public class InsertSortSet {

    public static void main(String[] args)
    {

       InsertSortSet sorter = new InsertSortSet();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};

        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    private void sort(int[] values){
        int temp;

        for(int i = 1; i<values.length ; i ++){
            for(int j = i ; j >0 ; j--){
                if(values[j] < values[j-1]){
                    temp = values[j];
                    values[j] = values[j -1];
                    values[j-1] = temp;
                }
            }
        }
     //   return values;
    }

}
