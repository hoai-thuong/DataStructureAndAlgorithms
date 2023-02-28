package Hw2.exercise5;

public class ComparableSort {
    public <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Insert i'th record
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
//                    swap(A, j-1, j);
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) { // Insert i'th record
            for (int j = i; (j > 0) && (arr[j].compareTo(arr[j - 1]) < 0); j--) {
                T temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
//            countComparison++;

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            T temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void haha() {
        System.out.println("dien");

    }

    static <T extends Comparable<T>> void display(T[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 4, 6};
        String[] arr1 = {"a", "c", "b"};
        Double[] arr2 = {0.6, 4.5, 3.2};
        ComparableSort sc = new ComparableSort();
        sc.bubbleSort(arr);
        sc.insertionSort(arr1);
        sc.selectionSort(arr2);
        display(arr);
        display(arr1);
        display(arr2);

    }
}
