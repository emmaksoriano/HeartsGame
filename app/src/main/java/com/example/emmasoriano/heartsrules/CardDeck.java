package com.example.emmasoriano.heartsrules;

import java.util.ArrayList;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class CardDeck {

    Card[] deck =new Card[52];
    public String[] faceValues= {"Two", "Three", "Four", "Five", "Six", "Seven",
                            "Eight", "Nine", "Ten", "Jack", "Queen","King","Ace"};
    public String[]suitValues = {"Clubs", "Spades", "Diamonds", "Hearts"};

    public CardDeck(){

        //initialize the deck so the cards are "in order"

        shuffle();
    }

    public void shuffle(){


    }

    public Card[] dealHand(){
        Card[] hand = new Card[13];
        int counter = 0;

        //takes 13 cards from top of deck, removes them from deck and adds them to players hand


        return hand;
    }
}
