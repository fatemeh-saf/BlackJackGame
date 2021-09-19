package com.fatemeh;

import java.util.ArrayList;
import java.util.Arrays;

public class BlackJackApp {

    public static void main(String[] args) {

        //create a deck

        Deck deck=new Deck();
        deck.generateDeck();
        System.out.println("Original Deck: "+deck.getHandCards());
        deck.shuffleCards();
        System.out.println("Shuffled Deck: "+deck.getHandCards());

        //create a players and dealer
        Hand[] players={new Hand(),new Hand()};
        Hand dealer=new Hand();

        //deal 2cards to players
        deck.dealCard(dealer,2);
        deck.dealCard(players,2);

        //show players hand
        for(Hand player:players){
            player.flipCards();
            player.showCards();
        }






    }
}
