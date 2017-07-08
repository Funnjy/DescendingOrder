package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anton Ilchenko on 08.07.2017.
 */
public class ArrayOperations {
    public int[] getIntegers(Scanner s, int number) {
        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = s.nextInt();
        }
        return values;
    }

    public void printArray(int[] arr) {
         if (arr == null) {
             System.out.println("Array is empty");

         }else{
             for (int i = 0; i < arr.length ; i++) {
                 System.out.println("Array element" + i + " is " + arr[i]);
             }
         }
    }

    public int[] sortIntegers(int[] arr) {
        int[] sort = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for (int i = 0; i < sort.length-1; i++) {
                if(sort[i] < sort[i+1]){
                    temp = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = temp;
                    flag = true;
                }

            }
        }
        return sort;
    }
}
