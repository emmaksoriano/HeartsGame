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
                deck[index] = new Card(j, i);
                index++;
            }
        }
        shuffle();
    }

    private static int[][] resIdx = {
            {
                    R.drawable.card_ac, R.drawable.card_2c, R.drawable.card_3c,
                    R.drawable.card_4c, R.drawable.card_5c, R.drawable.card_6c,
                    R.drawable.card_7c, R.drawable.card_8c, R.drawable.card_9c,
                    R.drawable.card_tc, R.drawable.card_jc, R.drawable.card_qc,
                    R.drawable.card_kc,
            },
            {
                    R.drawable.card_ad, R.drawable.card_2d, R.drawable.card_3d,
                    R.drawable.card_4d, R.drawable.card_5d, R.drawable.card_6d,
                    R.drawable.card_7d, R.drawable.card_8d, R.drawable.card_9d,
                    R.drawable.card_td, R.drawable.card_jd, R.drawable.card_qd,
                    R.drawable.card_kd,
            },
            {
                    R.drawable.card_ah, R.drawable.card_2h, R.drawable.card_3h,
                    R.drawable.card_4h, R.drawable.card_5h, R.drawable.card_6h,
                    R.drawable.card_7h, R.drawable.card_8h, R.drawable.card_9h,
                    R.drawable.card_th, R.drawable.card_jh, R.drawable.card_qh,
                    R.drawable.card_kh,
            },
            {
                    R.drawable.card_as, R.drawable.card_2s, R.drawable.card_3s,
                    R.drawable.card_4s, R.drawable.card_5s, R.drawable.card_6s,
                    R.drawable.card_7s, R.drawable.card_8s, R.drawable.card_9s,
                    R.drawable.card_ts, R.drawable.card_js, R.drawable.card_qs,
                    R.drawable.card_ks,
            },
    };

    /**
     * Shuffles the deck
     */
    public void shuffle(){
        int i, ranNum;
        ArrayList<Card> tempList = new ArrayList<>(Arrays.asList(deck));
        Card[] tempDeck = new Card[52];

        for (i = 0; i < 52; i++){
            ranNum =(int)(Math.random()*(tempList.size()-1));
            tempDeck[i] = tempList.get(ranNum);
            tempList.remove(ranNum);
        }
        deck = tempDeck;
    }

    /**
     *
     * @return Card[4][13]
     * The four players then their hands of 13 cards
     */
    public Card[][] dealHand() {
        shuffle();
        Card[][] hand = new Card[4][13];

        int counter = 0;
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < hand[0].length; j++) {
                hand[i][j] = deck[counter];
                counter++;
            }
            sortCards(hand[i]);
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
        int i, j;
        int indexCounter = 0;
        int count = 0;
        Card[] rtrnHand = new Card[cards.length];
        ArrayList<Card> cardsToSort = new ArrayList<>();

        if(cards != null) {
            for (i = 0; i < 4; i++) {
                cardsToSort = new ArrayList<>();
                for (j = 0; j < cards.length - 1; j++) {
                    if(cards[i] != null) {
                        if (cards[j].suitValueIndex == i) {
                            cardsToSort.add(cards[j]);
                            count++;
                        }
                    }
                }
                insertionSort(cardsToSort);
                for(Card C : cardsToSort){
                    rtrnHand[indexCounter] = C;
                    indexCounter++;
                }
                if(indexCounter >= cards.length){
                    break;
                }
            }
        }
        return rtrnHand;
    }

    /**
     * Uses the insertion sort algorithm to sort cards based on face value
     * @param cards
     * @return
     */
    public ArrayList<Card> insertionSort(ArrayList<Card> cards){

        int i, j;
        Card tempCard;

        for(i = 1; i < cards.size(); i++){
            tempCard = cards.get(i);
            j = i - 1;
            while ((j >= 0) && (cards.get(j).faceValue > tempCard.faceValue)){
                cards.set(j+1, cards.get(j));
                j = j-1;
            }
            cards.set(j+1, tempCard);
        }

        return cards;
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
