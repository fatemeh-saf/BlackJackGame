package com.fatemeh;

public class Card {

    private Suit cardSuit;
    private Rank cardRank;
    private boolean face;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
        this.face=false; //we can't see the card rand and suit
    }

    public String getCardSuit() {
        return cardSuit.getSuit();
    }

//    public void setCardSuit(Suit cardSuit) {
//        this.cardSuit = cardSuit;
//    }

//    public int getCardRank() {
//        return cardRank.getIntRank();
//    }

    public Rank getCardRank() {
        return cardRank;
    }

//    public void setCardRank(Rank cardRank) {
//        this.cardRank = cardRank;
//    }

    public void setFace(boolean face){
        this.face=face;
    }

    public boolean getFace(){
        return this.face;
    }

    @Override
    public String toString() {
        return cardRank  +" "+cardSuit;
    }
}
