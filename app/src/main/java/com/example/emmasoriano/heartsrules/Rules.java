package com.example.emmasoriano.heartsrules;

/**
 * This class checks legality of players moves and finds the winner of the round.
 * Created by emmasoriano on 10/19/17.
 */

public class Rules {
    Player currentPlayer;

    //constructor
    public Rules(){
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
    public Player checkTurn(Player p1, Player p2, Player p3, Player p4){


        if(p1.myTurn == true){
            currentPlayer = p1;
        }
        else if(p2.myTurn == true){
            currentPlayer = p1;

        }
        else if(p3.myTurn == true){
            currentPlayer = p1;
        }
        else if(p4.myTurn == true){
            currentPlayer = p1;
        }

        return currentPlayer;
    }

    //determines who won the round
    public void winRound(Player p1, Player p2, Player p3, Player p4){
        //find suit of first card played
        //find highest card of suit played
        //find which player played that card
        //player.isWinner = true;
    }

}
