package com.example.emmasoriano.heartsrules;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        GameState gameState = new GameState(1, "test Name");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/**
    CardDeck deck = new CardDeck();
    HumanPlayer user = new HumanPlayer("Bob");
    //ask user what dificulty they want the AI to be
    //create 3 AI players
    boolean hardAI;
    if(hardAI == true){
        HardAI cp1 = new HardAI("Computer Player 1");
        HardAI cp2 = new HardAI("Computer Player 2");
        HardAI cp3 = new HardAI("Computer Player 3");
        GameState game = new GameState(1, user.getName());
    }
    else{
        EasyAI cp1 = new EasyAI("Computer Player 1", deck);
        EasyAI cp2 = new EasyAI("Computer Player 2", deck);
        EasyAI cp3 = new EasyAI("Computer Player 3", deck);
        GameState game = new GameState(deck,user,cp1,cp2,cp3);
    }
**/




}
