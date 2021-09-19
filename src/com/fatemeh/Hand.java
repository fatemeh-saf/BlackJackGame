package com.fatemeh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Hand {
    // it starts with no card at the hand
    // as the game proceeds, more cards are added to the hand

    private ArrayList<Card> handCards;

    //start with empty hand
    public Hand() {
        handCards = new ArrayList<>();
    }

    public ArrayList<Card> getHandCards() {
        return handCards;
    }

    public Card getCard(int index) {
        return handCards.get(index);
    }

    public void clearHand() {
        handCards.clear();
    }

    public void addCard(Card card) {
        handCards.add(card);
    }

    public void flipCards() {
        handCards.forEach(c -> c.setFace(true));
    }

    public boolean handCardFaces(){
        boolean cardFaces = true;
        for (Card c : handCards) {
            if (!c.getFace()) {
                cardFaces = false;
                break;
            }
        }
        return cardFaces;

    }

    public boolean hasAce(){
        boolean ace=false;
        for (Card c:handCards){
            if(c.getCardRank().toString().equals("ACE")) {
                ace=true;
                break;
            }

        }
        return ace;
    }

    public void showCards() {

        if (handCardFaces()) {
            System.out.print("player hand: "+handCards);
            System.out.println (" >> Total point: "+totalHandValue());
        }
    }

    //if the this.hand has the card, it will give card to hand
    public boolean tradeCard(Card card, Hand hand) {
        if (!handCards.contains(card)) return false;
        else {
            handCards.remove(card);
            hand.addCard(card);
            return true;
        }


    }

    public int totalHandValue() {
        ArrayList<Integer> cardValues = new ArrayList<>();
        handCards.forEach(c -> cardValues.add(c.getCardRank().getIntRank()));
        int value=cardValues.stream().reduce(0, (a, b) -> a + b);
        if(value<11 && hasAce()) value+=10;
        return value;
    }


}
