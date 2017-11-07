package com.example.emmasoriano.heartsrules;


/**
 * Created by emmasoriano on 10/23/17.
 */

public class GameState implements onClickListener{
    Player[] players = new Player[4];
    Player currentPlayer; //find/verify with playerID
    Player nextPlayer; //find/verify with playerID
    int[] currentScores;
    int currentSuit; // determined by a row of cards in the CardDeck 2D array
    Table cardsPlayed;

    public GameState(){


    }

    public void setCurrentPlayer(Player initPlayer){
        currentPlayer = initPlayer;
    }

    //should have listeners to update the GUI?
    //should we put our pop up menu code here?

}
