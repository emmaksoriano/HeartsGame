package com.example.emmasoriano.heartsrules;

/**
 * Created by emmasoriano on 10/19/17.
 */

public class Table {

    Card[] table = new Card[4];

    //Constructor
    public Table(){
        //initialize "empty" table
        for(int i=0; i<4; i++){
            table[i]=null;
        }

    }

    public void addCard(Card card){

        for(int i=0; i<4; i++){
            if(table[i]= null){
                table[i]=card;
                break;
            }
        }
    }

    public Card[] getTable(){

        return table;
    }

    public void clearTable(){
        for(int i=0; i<4; i++){
            table[i]=null;
        }
    }
}
