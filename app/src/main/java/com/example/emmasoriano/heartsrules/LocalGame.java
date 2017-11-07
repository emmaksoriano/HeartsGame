package com.example.emmasoriano.heartsrules;

/**
 * This class checks legality of players moves and finds the winner of the round.
 * Created by emmasoriano on 10/19/17.
 */

public class LocalGame {
    GameState currentGame;

    //constructor
    public LocalGame(GameState game){
        currentGame = game;
        //find which hand has 2 of clubs
        //initialize all the players myTurn variables


    }

    //checks if card played is legal
    public boolean validCard(CardDeck card){

    //check if they played a card of the same suit as first card played,
    // if not, check if they have a card of that suit,
    // if yes then illegal move
        return false;
    }

    //checks if its legal for a player to play a card
    public boolean validTurn(Player player){
        return player.myTurn;
    }

    //checks who's turn it is to play a card
    public Player checkTurn(){
        Player currentPlayer = null;

        for(int i = 0; i<currentGame.players.length; i++){
            if(currentGame.players[i].myTurn == true){
                currentPlayer = currentGame.players[i];
            }
        }

        currentGame.setCurrentPlayer(currentPlayer);
    }

    //determines who won the round
    public void winRound(){
        //find suit of first card played
        //find highest card of suit played
        //find which player played that card
        //currentGame.player[i].setIsWinner(true);
    }

    public void threeCardPass(GameState game){

    }

    public int calculatePoints(){
    return 0;
    }

    public void updateScore(){
        int points = calculatePoints();
        for(int i = 0; i<currentGame.players.length; i++){
            if(currentGame.players[i].isWinner == true){
                currentGame.players[i].setScore(points);
            }
        }

    }

}
