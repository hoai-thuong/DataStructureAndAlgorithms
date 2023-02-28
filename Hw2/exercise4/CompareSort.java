package Hw2.exercise4;


import java.util.Arrays;
import java.util.Random;

public class CompareSort {
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    int[] generateArray(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    int[] bubbleSort(int arr[]) {
        int swaps = 0;
        int comparisons = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
                comparisons++;
            }
        }
        int[] info = {swaps, comparisons};
        return info;
    }

    int[] selectionSort(int arr[]) {
        int swaps = 0;
        int comparisons = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                comparisons++;
            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        int[] info = {swaps, comparisons};
        return info;
    }

    int[] insertionSort(int arr[]) {
        int swaps = 0;
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {

            int j = i;

            // compare i with sorted elements and insert it
            // sorted elements: [0..i-1]
            while (j > 0 && arr[j] < arr[j - 1]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                swaps++;
                comparisons++;  // loop condition true

                j--;
            }
            comparisons++; // checking loop condition when false
        }
        int[] info = {swaps, comparisons};
        return info;
    }


    double[] calculateComplexity(int[] arr, int[] forceRun) {
        long startTime = System.nanoTime();
        int[] swapAndCompare = forceRun;
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) * 0.001;
        double[] info = {(double) swapAndCompare[0], (double) swapAndCompare[1], duration};
        return info;
    }

    void summary(int n) {
        double swaps_1 = 0;
        double comparations_1 = 0;
        double duration_1 = 0;

        double swaps_2 = 0;
        double comparations_2 = 0;
        double duration_2 = 0;

        double swaps_3 = 0;
        double comparations_3 = 0;
        double duration_3 = 0;

        for (int i = 0; i < n; i++) {
            int [] arr = generateArray(n);
            int[] copiedArray1 = Arrays.copyOf(arr, arr.length);
            int[] copiedArray2 = Arrays.copyOf(arr, arr.length);
            int[] copiedArray3 = Arrays.copyOf(arr, arr.length);
//            double[] data1 = calculateBubbleSortComplexity(copiedArray1);
            double[] data1 = calculateComplexity(copiedArray1, bubbleSort(copiedArray1));

            swaps_1 += data1[0];
            comparations_1 += data1[1];
            duration_1 += data1[2];

            double[] data2 = calculateComplexity(copiedArray2, selectionSort(copiedArray2));
            swaps_2 += data2[0];
            comparations_2 += data2[1];
            duration_2 += data2[2];

            double[] data3 = calculateComplexity(copiedArray3, insertionSort(copiedArray3));
            swaps_3 += data3[0];
            comparations_3 += data3[1];
            duration_3 += data3[2];

        }

        System.out.println("\nBubble Sort: ");
        System.out.println("Số lần đổi chỗ trung bình trong 10 lần chạy: " + swaps_1 / 10);
        System.out.println("Số lần so sánh trung bình trong 10 lần chạy: " + comparations_1 / 10);
        System.out.println("Thời gian chạy trung bình 10 lần: " + duration_1 / 10);

        System.out.println("\nSelection Sort: ");
        System.out.println("Số lần đổi chỗ trung bình trong 10 lần chạy: " + swaps_2 / 10);
        System.out.println("Số lần so sánh trung bình trong 10 lần chạy: " + comparations_2 / 10);
        System.out.println("Thời gian chạy trung bình 10 lần: " + duration_2 / 10);

        System.out.println("\nInsertion Sort: ");
        System.out.println("Số lần đổi chỗ trung bình trong 10 lần chạy: " + swaps_3 / 10);
        System.out.println("Số lần so sánh trung bình trong 10 lần chạy: " + comparations_3 / 10);
        System.out.println("Thời gian chạy trung bình 10 lần: " + duration_3 / 10);

    }

    public static void main(String[] args) {
        CompareSort instance = new CompareSort();

        System.out.println("\nMẢNG 10 PHẦN TỬ: ");
        instance.summary(10);

        System.out.println("\nMẢNG 20 PHẦN TỬ: ");
        instance.summary(20);

        System.out.println("\nMẢNG 50 PHẦN TỬ: ");
        instance.summary(50);


    }
}
