package com.example.emmasoriano.heartsrules;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import edu.up.cs301.animation.AnimationSurface;
import edu.up.cs301.game.GameHumanPlayer;
import edu.up.cs301.game.GameMainActivity;


/**
 * Created by emmasoriano on 11/6/17.
 */

public class HeartsHumanPlayer extends GameHumanPlayer {

    public static final int animation_surface=0x7f09001c;
    //Declare Instance Variables

    public boolean doQuit() {
        return false;
    }
    /**
     * Constructor HumandPlayer
     * @param name
     */
    public HeartsHumanPlayer(String name)
    {
        super(name);
    }

    public void setAsGui(GameMainActivity activity) {

        // remember the activity
        GameMainActivity myActivity = activity;

        activity.setContentView(R.layout.hearts_layout);
        // Load the layout resource for the new configuration
        activity.setContentView(R.layout.hearts_layout);

        // link the animator (this object) to the animation surface
        AnimationSurface surface = (AnimationSurface) myActivity
                .findViewById(R.id.animation_surface);
        surface.setAnimator(this);

        // read in the card images
        Card.initImages(activity);

        // if the state is not null, simulate having just received the state so that
        // any state-related processing is done
        if (HeartsLocalGame != null) {
            receiveInfo(HeartsLocalGame);
        }
    }

    public void tick(Canvas g) {

        // ignore if we have not yet received the game state
        if (GameState == null) return;

        // get the height and width of the animation surface
        int height = surface.getHeight();
        int width = surface.getWidth();
        /***********************************************************************/

        Card c = state.getDeck(2).peekAtPlayerCard();

        for (int row = 1; row < 8; row++) {
            for (int col = 1; col < 3; col++) {

                float rectRight = 210;
                float rectTop = 1000;
                float rectBottom = 1300;
                float rectLeft = 60;

                rectLeft = rectLeft + ((row - 1) * 200);
                rectRight = rectRight + ((row - 1) * 200);
                rectTop = rectTop + ((col - 1) * 325);
                rectBottom = rectBottom + ((col - 1) * 325);

				/*
				rectLeft = (100 - CARD_WIDTH_PERCENT + LEFT_BORDER_PERCENT - RIGHT_BORDER_PERCENT) * width*(col*CARD_WIDTH_PERCENT) / 6000f;

				rectRight = rectLeft + width*(col*CARD_WIDTH_PERCENT) / 100f;
				rectTop = (100 - VERTICAL_BORDER_PERCENT - CARD_HEIGHT_PERCENT + CARD_WIDTH_PERCENT) * height *(CARD_HEIGHT_PERCENT*row)/ 3000f;
				rectBottom = (100 - VERTICAL_BORDER_PERCENT) * height / 100f;
				*/
                RectF midTopLocation = new RectF(rectLeft, rectTop, rectRight, rectBottom);

                drawCard(g, midTopLocation, c);
            }
        }
    }


    private static void drawCard(Canvas g, RectF rect, Card c) {
        if (c == null) {
            // null: draw a card-back, consisting of a blue card
            // with a white line near the border. We implement this
            // by drawing 3 concentric rectangles:
            // - blue, full-size
            // - white, slightly smaller
            // - blue, even slightly smaller
            Paint white = new Paint();
            white.setColor(Color.WHITE);
            Paint blue = new Paint();
            blue.setColor(Color.BLUE);
            RectF inner1 = scaledBy(rect, 0.96f); // scaled by 96%
            RectF inner2 = scaledBy(rect, 0.98f); // scaled by 98%
            g.drawRect(rect, blue); // outer rectangle: blue
            g.drawRect(inner2, white); // middle rectangle: white
            g.drawRect(inner1, blue); // inner rectangle: blue
        }
        else {
            // just draw the card
            c.drawOn(g, rect);
        }
    }
    /**
     * scales a rectangle, moving all edges with respect to its center
     *
     * @param rect
     * 		the original rectangle
     * @param factor
     * 		the scaling factor
     * @return
     * 		the scaled rectangle
     */
    private static RectF scaledBy(RectF rect, float factor) {
        // compute the edge locations of the original rectangle, but with
        // the middle of the rectangle moved to the origin
        float midX = (rect.left+rect.right)/2;
        float midY = (rect.top+rect.bottom)/2;
        float left = rect.left-midX;
        float right = rect.right-midX;
        float top = rect.top-midY;
        float bottom = rect.bottom-midY;

        // scale each side; move back so that center is in original location
        left = left*factor + midX;
        right = right*factor + midX;
        top = top*factor + midY;
        bottom = bottom*factor + midY;

        // create/return the new rectangle
        return new RectF(left, top, right, bottom);
    }

    public void playCard(){


    }

    public void selectCard(){


    }

    public void resetGame(){

    }

    public void quitGame(){

    }
}
