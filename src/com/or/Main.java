package com.or;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the array length: ");

        int[] arr = new int[SCANNER.nextInt()];

        System.out.println("Please enter the array values: ");

        for (int i = 0; i < arr.length ; ++i) {

            arr[i] = SCANNER.nextInt();
        }

        largest4(arr);
    }
        static void largest4 (int[] arr) {

        int length = arr.length;
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {

            }
              System.out.println("The largest possible 4 digit number is: ");
              System.out.print(arr[length-1]);
              System.out.print(arr[length-2]);
              System.out.print(arr[length-3]);
              System.out.print(arr[length-4]);
        }
    }




