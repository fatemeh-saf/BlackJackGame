package com.fatemeh;

import java.util.Arrays;


public enum Suit {

    HEARTS("Hearts"),
    SPADE("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private String suit;

    Suit(String suit){
        this.suit=suit;
    }

    public String getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        switch(suit){
            case "Hearts":
                return '\u2764'+"";
            case "Spades":
                return '\u2660'+"";
            case "Diamonds":
                return '\u2666'+"";
            case "Clubs":
                return '\u2663'+"";
            default:
                return "";

        }



    }


}
