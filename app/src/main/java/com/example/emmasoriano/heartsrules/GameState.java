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
    int round;
    Table table;

    public GameState(){


    }

    public void setCurrentPlayer(Player initPlayer){
        currentPlayer = initPlayer;
    }

    public void setNextPlayer(Player player){
        nextPlayer = player;
    }

    public void setPlayersScore(Player player, int addScore){
        player.setScore(addScore);
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }

    public Player getNextPlayer(){
        return nextPlayer;
    }

    public int getCurrentSuit(){
        return currentSuit;
    }

    public int getRound(){
        return round;
    }





}
