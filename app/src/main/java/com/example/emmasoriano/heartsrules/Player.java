package com.example.emmasoriano.heartsrules;

import android.content.DialogInterface;
import android.view.View;

import java.util.ArrayList;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class Player{

    Card [] hand = new Card[13];
    boolean myTurn;
    boolean isWinner;
    boolean hasTwoOfClubs = false;
    int score = 0;
    String name;



    //Constructor
    public Player(String playerName, CardDeck gameDeck){
        //set players name
        name = playerName;
        //deal players hand
        hand = gameDeck.dealHand();
        //determines if player has the starting card
        for( Card c: hand){
            if(c.getCardName().equals( "" + 2 + " of " + "Clubs")){
                hasTwoOfClubs = true;
            }
        }
    }

    public Card[] getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public boolean isMyTurn(){
        return myTurn;
    }

    public void setHand(Card[] initHand){
        hand = initHand;
    }

    public void setName(String initName){
        name = initName;
    }

    public void setScore(int initScore){
        score = score + initScore;
    }

    public void setMyTurn(boolean initMyTurn){
        myTurn = initMyTurn;
    }

    public void threeCardPass(Card one, Card two, Card three){
        //pass cards to appropriate player
    }

    public boolean checkIfCardinHand(Card card){
        for(int i = 0; i<hand.length; i++){
            if(hand[i].equals(card)){
                return true;
            }
        }
        return false;
    }

}
