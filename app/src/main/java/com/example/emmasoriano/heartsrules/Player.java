package com.example.emmasoriano.heartsrules;

import android.content.DialogInterface;
import android.view.View;

import java.util.ArrayList;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class Player{

    ArrayList<Integer> hand;
    boolean myTurn;
    boolean isWinner;
    boolean hasTwoOfClubs = false;
    int score = 0;
    String name;
    int playerID;


    //Constructor
    public Player(String playerName, int[] playerHand, CardDeck gameDeck){
        //set players name
        name = playerName;
        //deal players hand
        for(int i=0; i<playerHand.length;i++) {
            if(playerHand[i] != -1){
                hand.add(playerHand[i]);
            }
        }
        //determines if player has the starting card
        for(Integer i: hand){
            if(i == gameDeck.deck[0][0]){
                hasTwoOfClubs = true;
            }
        }
    }

    public ArrayList<Integer> getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public int getPlayerID(){
        return playerID;
    }

    public boolean isMyTurn(){
        return myTurn;
    }

}
