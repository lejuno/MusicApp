package com.example.android.musicapp;

import android.content.Intent;
import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailedSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_song);

        // Lets buy the song
        TextView foundSong = (TextView) findViewById(R.id.id_found_song);
        foundSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyAction = new Intent (DetailedSong.this, Payment.class);
                startActivity(buyAction);
            }
        });

        // Buttons
        Button returnButton = (Button) findViewById(R.id.id_button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToMain = new Intent(DetailedSong.this,MainActivity.class);
                startActivity(returnToMain);
            }
        });

        Button searchButton = (Button) findViewById(R.id.id_button_search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeDetails = new Intent(DetailedSong.this,MusicFinder.class);
                startActivity(seeDetails);
            }
        });

        Button buyButton = (Button) findViewById(R.id.id_button_buy);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyAction = new Intent(DetailedSong.this,Payment.class);
                startActivity(buyAction);
            }
        });
    }
}
