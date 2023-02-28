package Hw2.exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.*;


public class ShuffleCard {
    public static void main(String[] args) {
        Deck decks = new Deck();
        Card[] deck = decks.getDeck();
        List<Card> deckList = new ArrayList<Card>();
        for (int i = 0; i < deck.length ; i++) {
            deckList.add(deck[i]);
        }

        System.out.println("Before shuffling: ");
        for (Card card : deckList) {
            System.out.println(card);
        }
        Collections.shuffle(deckList);
        System.out.println("\nAfter shuffling: ");
        for (Card card : deckList) {
            System.out.println(card);
        }
    }
    public Integer[] randomArray(int n, int m ){
        Set<Integer> set = new HashSet<Integer>(); // use Set to avoid duplicate value
        Random rand = new Random(); //
        while (set.size() < n) {
            int num = rand.nextInt(m) + 1; // tạo số ngẫu nhiên từ 1 đến m
            set.add(num); // add into Set
        }
        Integer[] arr = set.toArray(new Integer[0]); //set to Array
        return arr;
    }
}
