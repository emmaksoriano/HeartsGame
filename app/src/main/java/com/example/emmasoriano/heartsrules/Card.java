package com.example.emmasoriano.heartsrules;

/**
 * Created by emmasoriano on 11/6/17.
 */

public class Card {

    public int faceValue;
    public String suitValue;
    public String cardName;
    public String[] faceValues = {"Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen","King","Ace"};

    public Card(int face, String suit){
        faceValue = face;
        suitValue = suit;
        setCardName();
    }

    public void setCardName(){
        cardName = faceValues[faceValue-2] + " of " + suitValue;
    }

    public int getCardValue(){
        return faceValue;
    }

    public String getSuitValue(){return suitValue;}

    public String getCardName(){
        return cardName;
    }


}

