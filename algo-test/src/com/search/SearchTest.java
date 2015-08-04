package com.search;

import java.util.Arrays;

/**
 * Created by vojhapa on 8/2/15.

 Binary search on sorted array only
 */
public class SearchTest {


    public static void main(String args[]){
        int[] arr1 = {2,45,234,567,876,900,976,999};

        // linear Search
        System.out.println(" linear search position "+ linearSearch(arr1, 876));

        //Binary Search
        System.out.println(" Binary while search position "+ binarySearchWhile(arr1, 876));
        System.out.println(" Binary FOR search position "+ binarSearhFor(arr1, 876));
        System.out.println(" Binary RECURSION search position "+ binaryRecursion(arr1, 0, arr1.length, 976));

    }

    private static int linearSearch(int[] arr, int key){
        for(int i = 0; i <= arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
    return 0;
    }

    private static int binarySearchWhile(int[] ar, int key){
        int start = 0;
        int end = ar.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(key == ar[mid]){
                return mid;
            }

            if(key < ar[mid]){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    private static int binarSearhFor(int[] ar, int key){
        int start = 0;
        int end = ar.length;

        for(int i = start; start<=end; i++){
            int mid = (start + end) / 2;
            if(ar[mid] == key){
                return mid;
            }else if(key < ar[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binaryRecursion(int[] ar, int start, int end, int key){

        if(start  <= end){
            int mid = (start + end) / 2;
            if(ar[mid] == key){
                return mid;
            }else if(key < ar[mid]){
                return binaryRecursion(ar, start, mid, key);
            }else {
                return binaryRecursion(ar, mid+1, end, key);
            }
        }
        return -1;
    }
}
