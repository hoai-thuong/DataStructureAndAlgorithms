package Hw2.exercise7;

import exercise6.Card;

public class Deck {
    private exercise6.Card[] deck;

    public Deck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int numOfCards = ranks.length * suits.length;
        deck = new exercise6.Card[numOfCards];
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i] = new exercise6.Card(rank, suit);
                i++;
            }
        }
    }

    public Card[] getDeck() {
        return deck;
    }
}