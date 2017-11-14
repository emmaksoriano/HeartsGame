package com.example.emmasoriano.heartsrules;

/**
 * Created by emmasoriano on 11/6/17.
 */

public class Card {

    public int faceValue;
    public int suitValueIndex;
    public String suitValue;
    public String cardName;
    public String[] suitValues = {"Clubs", "Spades", "Diamonds", "Hearts"};
    public String[] faceValues = {"Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen","King","Ace"};

    /**
     * Card
     * @param face
     * @param suit
     */
    public Card(int face, int suit){
        faceValue = face;
        suitValueIndex = suit;
        suitValue = suitValues[suit];
        setCardName();
    }

    /**
     *
     */
    public void setCardName(){
        cardName = faceValues[faceValue-2] + " of " + suitValue;
    }

    /**
     *
     * @return
     */
    public int getCardValue(){
        return faceValue;
    }

    /**
     *
     * @return
     */
    public String getSuitValue(){return suitValue;}

    /**
     *
     * @return
     */
    public String getCardName(){
        return cardName;
    }


}

