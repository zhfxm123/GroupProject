package ca.sheridancollege.project;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to play blackjack? [Y/N]");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            play(input);
        } else {
            System.out.print("Goodbye");
        }

    }

    public static void play(Scanner input) {

        System.out.println("What is your name?");
        String playerName = input.nextLine();

        Deck deck = new Deck();
        Hand userHand = new Hand(deck);
        Hand dealerHand = new Hand(deck);
        deck.shuffle();
        Dealer.dealCards();
        System.out.println("Your cards are" + userHand + "and the dealer is "
                + "showing: " + dealerHand);

    }

    public void declareWinner() {
        // TODO - implement Blackjack.declareWinner
        throw new UnsupportedOperationException();
    }

}
