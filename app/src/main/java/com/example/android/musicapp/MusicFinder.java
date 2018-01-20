package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MusicFinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_finder);

        // Lets search for the song
        TextView foundSong = (TextView) findViewById(R.id.id_found_song);
        foundSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeDetails = new Intent(MusicFinder.this,DetailedSong.class);
                startActivity(seeDetails);
            }
        });

        // Buttons
        Button returnButton = (Button) findViewById(R.id.id_button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToMain = new Intent(MusicFinder.this,MainActivity.class);
                startActivity(returnToMain);
            }
        });

        Button detailButton = (Button) findViewById(R.id.id_button_detail);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeDetails = new Intent(MusicFinder.this,DetailedSong.class);
                startActivity(seeDetails);
            }
        });

        Button buyButton = (Button) findViewById(R.id.id_button_buy);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyAction = new Intent(MusicFinder.this,Payment.class);
                startActivity(buyAction);
            }
        });
    }
}
