package com.example.emmasoriano.heartsrules;


/**
 * Created by emmasoriano on 10/23/17.
 */

public class GameState {
    Player[] players = new Player[4];
    Player currentPlayer;
    Player nextPlayer;
    int[] currentScores;
    int currentSuit;
    Table cardsPlayed;

    public GameState(){


    }

    public void setCurrentPlayer(Player initPlayer){
        currentPlayer = initPlayer;
    }



}
