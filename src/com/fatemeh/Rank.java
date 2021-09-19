package com.fatemeh;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int rank;

    Rank(int rank){
        this.rank=rank;
    }

    public int getIntRank(){
        return rank;
    }

    //public String getStrRank(){return Rank.this.name();}

    @Override
    public String toString() {
        return Rank.this.name();
    }


}
