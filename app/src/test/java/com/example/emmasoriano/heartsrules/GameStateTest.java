package com.example.emmasoriano.heartsrules;

import org.junit.Test;

import static org.junit.Assert.*;

//TODO FINISH TEST CLASS
/**
 * Created by lytle on 11/9/2017.
 */
public class GameStateTest {
    @Test
    public void setCurrentPlayer() throws Exception {
        GameState testGS = new GameState(0, "Test User");


    }

    @Test
    public void setNextPlayer() throws Exception {
        GameState testGS = new GameState(0, "Test User");

        //testGS.setCurrentPlayer(testGS.players[0]);
        testGS.setNextPlayer();

        Player p1 = testGS.players[1];
        Player p2 = testGS.nextPlayer;

        if(p1.equals(p2)){
            assertTrue(false);
        }
    }

    @Test
    public void setPlayersScore() throws Exception {

    }

    @Test
    public void getCurrentPlayer() throws Exception {

    }

    @Test
    public void getNextPlayer() throws Exception {

    }

    @Test
    public void getCurrentSuit() throws Exception {

    }

    @Test
    public void getRound() throws Exception {

    }

}