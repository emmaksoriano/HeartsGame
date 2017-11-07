package com.example.emmasoriano.heartsrules;

/**
 * Created by emmasoriano on 11/6/17.
 */

public class Card {
    public int faceValue;
    public String suitValue;
    public String cardName;

    public Card(int face, String suit){
        faceValue = face;
        suitValue = suit;
        cardName= ""+faceValue + " of " + suitValue;
    }
    public void setCardName(){

    }

    public int getCardValue(){
        return faceValue;
    }

    public String getCardName(){
        return cardName;
    }
}

}
