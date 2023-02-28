package Hw2.exercise3;


public class InsertionSort {

    static int countSwapped = 0;
    static int countComparison = 0;

    // Phương thức sắp xếp chèn
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
//            countComparison++;
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                countSwapped++;
                countComparison++;
                printArray(arr);
            }
            countComparison++;
            arr[j + 1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        System.out.println("Time compares: " + countComparison);
        System.out.println("Time swapped: " + countSwapped);

    }
}
