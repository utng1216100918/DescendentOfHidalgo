package mx.com.dloza.descendent;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;


    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int Image101, Image102, Image103, Image104, Image105, Image106,
            Image201, Image202, Image203, Image204, Image205, Image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerpoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_12, theCard);

            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_13, theCard);

            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_24, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_31, theCard);

            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag()) ;
                doStuff(iv_34, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card){
        //Set the correct image to the ImageView
        if (cardsArray[card] == 101){
            iv.setImageResource(Image101);
        }else if (cardsArray[card] == 102){
            iv.setImageResource(Image102);
        }else if (cardsArray[card] == 103){
            iv.setImageResource(Image103);
        }else if (cardsArray[card] == 104) {
            iv.setImageResource(Image104);
        } else if (cardsArray[card] == 105){
            iv.setImageResource(Image105);
        }else if (cardsArray[card] == 106){
            iv.setImageResource(Image106);
        }else if (cardsArray[card] == 201){
            iv.setImageResource(Image201);
        }else if (cardsArray[card] == 202){
            iv.setImageResource(Image202);
        }else if (cardsArray[card] == 203){
            iv.setImageResource(Image203);
        }else if (cardsArray[card] == 204){
            iv.setImageResource(Image204);
        }else if (cardsArray[card] == 205){
            iv.setImageResource(Image205);
        }else if (cardsArray[card] == 206){
            iv.setImageResource(Image206);
        }


        if (cardNumber == 1){
            firstCard = cardsArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if (cardNumber == 2){
            secondCard = cardsArray[card];
            if (secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }
    private void calculate(){
        if (firstCard == secondCard){
            if (clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 2){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (turn == 1){
                playerpoints++;
                tv_p1.setText("P1: " + playerpoints);
            }else if (turn == 2){
                cpuPoints++;
                tv_p2.setText("P2: "+ cpuPoints);
            }
        } else {
            iv_11.setImageResource(R.drawable.pregunta);
            iv_12.setImageResource(R.drawable.pregunta);
            iv_13.setImageResource(R.drawable.pregunta);
            iv_14.setImageResource(R.drawable.pregunta);
            iv_21.setImageResource(R.drawable.pregunta);
            iv_22.setImageResource(R.drawable.pregunta);
            iv_23.setImageResource(R.drawable.pregunta);
            iv_24.setImageResource(R.drawable.pregunta);
            iv_31.setImageResource(R.drawable.pregunta);
            iv_32.setImageResource(R.drawable.pregunta);
            iv_33.setImageResource(R.drawable.pregunta);
            iv_34.setImageResource(R.drawable.pregunta);

            if (turn == 1){
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if (turn == 2){
                turn= 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        checkEnd();
    }

    private void checkEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE  ){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GameActivity.this);
            alertDialogBuilder
                    .setMessage("GAME  OVER!\nP1: " + playerpoints + "\nP2: " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog  = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources(){
        Image101 =  R.drawable.h8;
        Image102 =  R.drawable.h9;
        Image103 =  R.drawable.h1;
        Image104 =  R.drawable.h3;
        Image105 =  R.drawable.h4;
        Image106 =  R.drawable.h5;
        Image201 =  R.drawable.h8copia;
        Image202 =  R.drawable.h9copia;
        Image203 =  R.drawable.h1copia;
        Image204 =  R.drawable.h3copia;
        Image205 =  R.drawable.h4copia;
        Image206 =  R.drawable.h5copia;

    }
}