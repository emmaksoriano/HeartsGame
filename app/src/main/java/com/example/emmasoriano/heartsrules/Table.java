package com.example.emmasoriano.heartsrules;

/**
 * Created by emmasoriano on 10/19/17.
 */

public class Table {

    int[] table = new int[4];

    //Constructor
    public Table(){
        //initialize "empty" table
        for(int i=0; i<4; i++){
            table[i]=-1;
        }

    }

    public void addCard(int card){

        for(int i=0; i<4; i++){
            if(table[i]==-1){
                table[i]=card;
                break;
            }
        }
    }

    public int[] getTable(){

        return table;
    }

    public void clearTable(){
        for(int i=0; i<4; i++){
            table[i]=-1;
        }
    }
}
