package com.example.emmasoriano.heartsrules;

import android.content.DialogInterface;
import android.view.View;

import java.util.ArrayList;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class Player{

    ArrayList<Card> hand = new ArrayList<>();
    Card[] myPass = new Card[3];
    boolean myTurn;
    boolean isWinner;
    boolean hasTwoOfClubs = false;
    int score = 0;
    String name;



    //Constructor
    public Player(String playerName){
        //set players name
        name = playerName;
        //deal players hand
        //hand = gameDeck.dealHand();
        //determines if player has the starting card
        for( Card c: hand){
            if(c.getCardName().equals( "" + 2 + " of " + "Clubs")){
                hasTwoOfClubs = true;
            }
        }
    }


    public Card[] getMyPass(){
        return myPass;
    }


    public Card[] getHand(){

        return (Card[]) hand.toArray();
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

    public void setMyPass(Card[] cards){
        myPass = cards;
    }

    /**
     * Set hand to given list of cards
     * @param initHand - shouldn't be more then
     */
    public void setHand(Card[] initHand){
        int i;
        for (i = 0; i < initHand.length; i++){
            hand.add(initHand[i]);
        }
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

    public void threeCardPass(Card[] pass, Player p){
        //pass cards to appropriate player
        p.setHand(pass);

        //remove cards passed to another player from hand
        for(Card c: hand){
            for(int i=0; i<pass.length; i++){
                if(c.equals(pass[i])){
                    hand.remove(pass[i]);
                }
            }
        }
    }

    public boolean checkIfCardinHand(Card card){
        for(Card c: hand){
            if(c.equals(card)){
                return true;
            }
        }
        return false;
    }

}
