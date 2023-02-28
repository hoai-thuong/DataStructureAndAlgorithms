package Hw2.exercise6;

import Hw2.exercise5.ComparableSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deck decks = new Deck();
        Card[] deck = decks.getDeck();
        System.out.println("Before sorting:");
        for (Card card : deck) {
            System.out.println(card);
        }
//        Cài đặt giao diện Comparable cho đối tượng Card, sử dụng các phương thức sắp  xếp đã làm ở bài 5 để sắp xếp bộ bài.
        ComparableSort cs = new ComparableSort();
        cs.selectionSort(deck);

//        Sử dụng thư viện Arrays, phương thức sort(T[] a, Comparator<? super T> c) để sắp xếp bộ bài. (a là bộ bài, c là đối tượng comparecard).
        Arrays.sort(deck, new CompareCard());

        System.out.println("\nAfter sorting:");
        for (Card card : deck) {
            System.out.println(card);
        }




    }
}