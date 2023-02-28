package Hw1.exercise6;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
// Hàm dựng với kích thước mảng là capacity
        if (capacity < 0) {
            throw new IllegalArgumentException("Not enough" + capacity);
        } else {
            array = (T[]) new Object[capacity];
        }

    }

    public void add(T data) {
        array[n++] = data;
    }

    public T get(int i) {
        return array[i];
    }

    public void set(int i, T data) {
        System.arraycopy(array, i, array, i + 1, i - i);
        array[i] = data;
        i++;

    }

    //lam sao de su dung duoc
    public void remove(T data) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != data) {
                array[index++] = array[i];
            }
        }
        array = Arrays.copyOf(array, index);
//        System.out.println(array);
    }

    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < n; i++) {
                if (o.equals(array[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        }

        return -1;
    }

    public void isContain(T data) {
        if (indexOf(data) >= 0) {
            System.out.println("Array contains " + data);
        } else {
            System.out.println("Array does not contain " + data);
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        return null;
    }
    public void printArray(SimpleArrayList<T> list)  {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        SimpleArrayList<Integer> list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1, 100);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
        list.printArray(list);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        System.out.println(list.indexOf(0));
        list.isContain(1000);

    }

}
