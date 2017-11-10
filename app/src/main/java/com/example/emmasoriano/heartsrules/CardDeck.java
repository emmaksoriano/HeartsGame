package com.example.emmasoriano.heartsrules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


/**
 * Created by emmasoriano on 10/19/17.
 */

public class CardDeck {

    Card[] deck = new Card[52];
    public String[] suitValues = {"Clubs", "Spades", "Diamonds", "Hearts"};

    // Constructor
    public CardDeck(){
        //initialize the deck so the cards are "in order"

        int i, j;
        int index = 0;
        for (i = 0; i < 4; i++){
            for(j = 2; j < 13; j++){
                deck[index] = new Card(j, suitValues[i]);
                index++;
            }
        }

        shuffle();
    }

    // Shuffles the deck
    public void shuffle(){

        int i;
        ArrayList<Card> tempList = new ArrayList<>(Arrays.asList(deck));

        for (i = 0; i < 52; i++){
            tempList.get((int)(Math.random()*(52-i)));
        }

    }

    public Card[][] dealHand(){
        shuffle();
        Card[][] hand = new Card[4][13];
        int counter = 0;
        int i, j;
        for(i = 0; i < 4; i++){
            for(j = 0; j < 13; j++){
                hand[i][j] = deck[counter];
                counter++;
            }
        }
        //takes 13 cards from top of deck, removes them from deck and adds them to players hand


        return hand;
    }

    /**
     * sorts a given set of cards by suit and value
     * @param cards
     * @return
     */
    public Card[] sortCards(Card[] cards){
        // sorts cards based on suit and
        int i, j, index;
        Card[] rtrnHand = new Card[cards.length];
        ArrayList<Card> cardsToSort = new ArrayList<>();
        for(i = 0; i < 4; i++){
            for(j = 0; j < cards.length; j++){
                if(cards[j].getSuitValue().equals(suitValues[i])){
                    cardsToSort.add(cards[i]);
                }
            }
            // Quick sort algorithm
            cardsToSort = quickSort(cardsToSort);
            index = 0;
            for(Card c : cardsToSort){
                rtrnHand[index] = c;
                index++;
            }
        }
        return rtrnHand;
    }

    /**
     * Uses a quick sort algorithm to sort cards
     * based on face value, not suit.
     * @param cards
     * @return
     */
    public ArrayList<Card> quickSort(ArrayList<Card> cards){

        // Declare Variables
        ArrayList<Card> rtnCards = new ArrayList<>();
        ArrayList<Card> greater = new ArrayList<>();
        ArrayList<Card> less = new ArrayList<>();
        Card pivotCard;
        int pIndex;

        if(cards != null){
            if(cards.size() == 1){
                return cards;
            }
            else{

                pIndex = cards.size()/2;
                pivotCard = cards.get(pIndex);
                for(Card c : cards){
                    if(!(c.equals(pivotCard))){
                        if(c.faceValue > pivotCard.faceValue){
                            greater.add(c);
                        }
                        else{
                            less.add(c);
                        }
                    }
                }

                rtnCards.addAll(quickSort(greater));
                rtnCards.add(pivotCard);
                rtnCards.addAll(quickSort(less));
            }
        }
        return rtnCards;
    }
}
