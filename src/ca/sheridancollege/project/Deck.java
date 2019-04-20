package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

class Deck {

    private ArrayList<Card> deck;//represents a deck of cards

    Deck() {

        deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card getCard() {
        return deck.remove(0);
    }

}
