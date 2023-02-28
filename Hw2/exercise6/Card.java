package Hw2.exercise6;

public class Card implements Comparable<Card> {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public int compareTo(Card o) {
        // Sử dụng compareTo của String để so sánh rank và suit của hai quân bài
        int compareSuit = this.suit.compareTo(o.getSuit());
        if (compareSuit != 0) {
            return compareSuit;
        }
        return this.rank.compareTo(o.getRank());
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}