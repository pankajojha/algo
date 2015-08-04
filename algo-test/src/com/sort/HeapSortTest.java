package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 */
public class HeapSortTest {


    public static void main(String[] args) {

        MergeSortTest sorter = new MergeSortTest();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};

        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    private void sort(int[] arr){

    }
}
