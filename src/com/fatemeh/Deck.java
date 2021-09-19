package com.fatemeh;

//special hand class

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Hand {

    public void generateDeck() {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Rank.values().length; j++) {
                this.addCard(new Card(Suit.values()[i], Rank.values()[j]));
            }
        }
    }

    public void shuffleCards(int times) {
        Random rand = new Random();
        int size = this.getHandCards().size();

        //first approach
//
//        for (int i = 0; i < times; i++) {
//            int index1 = rand.nextInt(max);
//            int index2 = rand.nextInt(max);
//            while (index1==index2) index2=rand.nextInt(max);
//            Card temp = this.getCard(index1);
//            this.getHandCards().set(index1, this.getCard(index2));
//            this.getHandCards().set(index2, temp);

        //second approach--> more efficient:
        for (int i = size - 1; i >= 0; i--) {
            int index = rand.nextInt(size);
            Card last = this.getHandCards().get(i);
            this.getHandCards().set(i, this.getCard(index));
            this.getHandCards().set(index, this.getCard(i));

        }


        //this.getHandCards().get(index1)=this.getHandCards()


    }

    public void shuffleCards(){
        shuffleCards(100);
    }

    public void dealCard(Hand hands[], int noCards) {
        for (int i = 0; i < hands.length; i++) dealCard(hands[i], noCards);
    }

    public void dealCard(Hand hand, int noCards) {
        for (int i = 0; i < noCards; i++) {
            this.tradeCard(this.getHandCards().get(0), hand);
        }

    }


}
