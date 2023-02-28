package Hw2.exercise2;


public class SelectionSort {
    static int countSwapped = 0;
    static int countComparison = 0;

    public static void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
//            countComparison++;

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                countComparison++;
            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            countSwapped++;
            printArray(arr);
        }
    }

    // Xuất mảng
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,4,3,2,4,5};
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        System.out.println("Times swapped: " + countSwapped);
        System.out.println("Times comparison: " + countComparison);

    }
}