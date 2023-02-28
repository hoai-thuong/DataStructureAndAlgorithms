package Hw2.exercise6;

public class Deck {
    private Card[] deck;

    public Deck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int numOfCards = ranks.length * suits.length;
        deck = new Card[numOfCards];
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i] = new Card(rank, suit);
                i++;
            }
        }
    }

    public Card[] getDeck() {
        return deck;
    }
}