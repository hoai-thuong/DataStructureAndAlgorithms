package Hw2.exercise1;

public class BubbleSort {
    static int countSwapped = 0;
    static int countComparison = 0;

    public void bubbleSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
//            countComparison++;
            for (int j = 0; j < size - i - 1; j++) {
//                 countComparison++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    countSwapped++;
                    display(arr);
                }
                countComparison++;
            }
        }
    }

    public void display(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {5, 3, 8, 4, 6};
        BubbleSort bs = new BubbleSort();
        long start1 = System.nanoTime();
        bs.bubbleSort(arr);
        long end1 = System.nanoTime();
        long executeTime = end1 - start1;
        System.out.println("Elapsed Time in micro seconds: "+ executeTime * 0.001);
        System.out.println("Sorted array: ");
        bs.display(arr);
        System.out.println("Times comparison: " + countComparison);
        System.out.println("Times swapped: " + countSwapped);
        System.out.println();

    }
}

