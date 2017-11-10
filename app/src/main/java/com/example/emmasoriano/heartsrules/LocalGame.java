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

        return currentPlayer;
    }

    //determines who won the round
    public void winRound(){
        //find suit of first card played
        //find highest card of suit played
        //find which player played that card
        //currentGame.player[i].setIsWinner(true);
    }

    public void CardPass(){
        //ask user to select three cards then hit "pass" button
        // TODO Fix this
        if(false){
            //have a round int that tells us which way to pass
            if(currentGame.round == 0) {
                //pass right
                currentGame.players[0].threeCardPass(currentGame.players[0].getMyPass(),currentGame.players[1]);
                currentGame.players[1].threeCardPass(currentGame.players[1].getMyPass(),currentGame.players[2]);
                currentGame.players[2].threeCardPass(currentGame.players[2].getMyPass(),currentGame.players[3]);
                currentGame.players[3].threeCardPass(currentGame.players[3].getMyPass(),currentGame.players[0]);

            }

            if(currentGame.round == 1) {
                //pass right
                currentGame.players[0].threeCardPass(currentGame.players[0].getMyPass(),currentGame.players[3]);
                currentGame.players[1].threeCardPass(currentGame.players[1].getMyPass(),currentGame.players[0]);
                currentGame.players[2].threeCardPass(currentGame.players[2].getMyPass(),currentGame.players[1]);
                currentGame.players[3].threeCardPass(currentGame.players[3].getMyPass(),currentGame.players[2]);

            }

            if(currentGame.round == 2) {
                //pass across table
                currentGame.players[0].threeCardPass(currentGame.players[0].getMyPass(),currentGame.players[2]);
                currentGame.players[1].threeCardPass(currentGame.players[1].getMyPass(),currentGame.players[3]);
                currentGame.players[2].threeCardPass(currentGame.players[2].getMyPass(),currentGame.players[0]);
                currentGame.players[3].threeCardPass(currentGame.players[3].getMyPass(),currentGame.players[1]);

            }

        }

    }

    public int calculatePoints(){
        int points = 0;

        for(Card c: currentGame.table.cardsPlayed){
            //add one point each time a heart is on the table
            if(c.suitValue.equals("Hearts")){
             points++;
            }
            //add 13 points if the queen of spades is on the table
            else if(c.suitValue.equals("Spades")&& c.faceValue == 10){
                points=+13;
            }
        }

        return points;
    }

    public void updateScore(){
        int points = calculatePoints();
        for(int i = 0; i<currentGame.players.length; i++){
            if(currentGame.players[i].isWinner == true){
                currentGame.players[i].setScore(points);
            }
        }
    }

    public void dealCards(){
        // deals each player their hands
    }

}
