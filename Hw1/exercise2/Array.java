package Hw1.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Nhap mang
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        printArray(arr);
        int x = 5;
        System.out.println();
        System.out.println("Count " + x + " in array: " + findElement(arr, x));
        System.out.print("Sorted Array: ");
        printArray(sortArray(arr));

    }

    //In mang
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //Tim kiem phan tu
    public static int findElement(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    //sap xep mang
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }


}

