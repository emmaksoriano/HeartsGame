package com.example.emmasoriano.heartsrules;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class CardDeck {

    Card[] deck = new Card[52];
    public String[] suitValues = {"Clubs", "Spades", "Diamonds", "Hearts"};

    // Constructor
    public CardDeck(){
        //initialize the deck so the cards are "in order"

        int i, j;
        int index = 0;
        for (i = 0; i < 4; i++){
            for(j = 2; j < 13; j++){
                deck[index] = new Card(j, suitValues[i]);
                index++;
            }
        }

        shuffle();
    }

    // Shuffles the deck
    public void shuffle(){

        int i;
        ArrayList<Card> tempList = new ArrayList<>(Arrays.asList(deck));

        for (i = 0; i < 52; i++){
            tempList.get((int)(Math.random()*(52-i)));
        }

    }

    public Card[][] dealHand(){
        shuffle();
        Card[][] hand = new Card[4][13];
        int counter = 0;
        int i, j;
        for(i = 0; i < 4; i++){
            for(j = 0; j < 13; j++){
                hand[i][j] = deck[counter];
                counter++;
            }
        }
        //takes 13 cards from top of deck, removes them from deck and adds them to players hand


        return hand;
    }
}
