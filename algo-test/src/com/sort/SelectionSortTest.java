package com.sort;

/**
 * Created by vojhapa on 8/1/15.
 * The selection sort is a combination of searching and sorting. During each pass, the unsorted element with the smallest (or largest)
 * value is moved to its proper position in the array. The number of times the sort passes through the array is one less than the number
 * of items in the array. In the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places that
 * value into its proper location.

 */
public class SelectionSortTest { // analyse n-1

    public static void main(String[] args)
    {

        SelectionSortTest sorter = new SelectionSortTest();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};

        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    private void sort(int[] arr){

        for(int i = 0; i< arr.length; i++){
            int index = i;

            for(int j = i; j <arr.length; j++){
                if(arr[j] <arr[index]){
                    index = j;
                }
                int smallerNumber = arr[index];
                arr[index] = arr[j];
                arr[i] = smallerNumber;
            }
        }
    }


}
