package Hw2.exercise7;


import java.util.Comparator;

public class CompareCard implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        int compareSuit = o1.getSuit().compareTo(o2.getSuit());
        if (compareSuit != 0) {
            return compareSuit;
        }
        return o1.getRank().compareTo(o2.getRank());
    }
}