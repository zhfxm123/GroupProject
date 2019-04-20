package ca.sheridancollege.project;

import java.util.ArrayList;

public class Hand {

    public Hand(Deck deck) {

        ArrayList drawHand = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            drawHand.add(deck.getCard());
        }

    }

    public String showCards(ArrayList drawHand) {

        return drawHand.toString();

    }

}
