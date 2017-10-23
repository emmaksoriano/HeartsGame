package com.example.emmasoriano.heartsrules;

import java.util.ArrayList;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class CardDeck {

    int[][] deck =new int[4][13];
    public String[] faceValues= {"Two", "Three", "Four", "Five", "Six", "Seven",
                            "Eight", "Nine", "Ten", "Jack", "Queen","King","Ace"};
    public String[]suitValues = {"Clubs", "Spades", "Diamonds", "Hearts"};

    public CardDeck(){

        //initializes the deck so the cards are "in order"
        int counter = 0;
        for(int i= 0; i<4; i ++) {
            for (int j=0; j<13; j++){
                deck[i][j]= counter;
                counter++;
            }
        }

        shuffle();
    }

    public void shuffle(){
        int row;
        int col;
        for(int card = 1; card <= 52; card++)
        {
            row = (int) Math.random()* 4;
            col = (int) Math.random()* 13;

            while(deck[row][col] != 0)
            {
                row = (int) Math.random()*4;
                col = (int) Math.random()* 13;
            }
            deck[row][col] = card;
        }

    }

    public ArrayList<Integer> dealHand(){
        ArrayList<Integer> hand = new ArrayList<Integer>();
        int counter = 0;

        //takes 5 cards from top of deck, removes them from deck and adds them to players hand
        for( int i = 0; i<4; i++){
            for(int j=0; j<13; j++){
                if(deck[i][j]!= -1 && counter<13){ //thinking of -1 like a null value
                    hand.add(deck[i][j]);
                    deck[i][j]= -1;
                    counter++;
                }
            }
        }

        return hand;
    }
}
