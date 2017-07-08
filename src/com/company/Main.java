package com.company;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayOperations op = new ArrayOperations();
        int[] myIntegers = op.getIntegers(scanner,5);
        int[] sorted = op.sortIntegers(myIntegers);
        op.printArray(sorted);
    }
}
