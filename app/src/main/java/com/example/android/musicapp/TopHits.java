package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TopHits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_hits);

        // Should Send Action to Detail View with specific Song Names
        TextView item1 = (TextView) findViewById(R.id.id_item_1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });
        TextView item2 = (TextView) findViewById(R.id.id_item_2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });
        TextView item3 = (TextView) findViewById(R.id.id_item_3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });
        TextView item4 = (TextView) findViewById(R.id.id_item_4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });
        TextView item5 = (TextView) findViewById(R.id.id_item_5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });
        TextView item6 = (TextView) findViewById(R.id.id_item_6);
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsAction = new Intent(TopHits.this, DetailedSong.class);
                startActivity(detailsAction);
            }
        });

        // Buttons
        Button returnButton = (Button) findViewById(R.id.id_button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToMain = new Intent(TopHits.this,MainActivity.class);
                startActivity(returnToMain);
            }
        });

        Button searchButton = (Button) findViewById(R.id.id_button_search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeDetails = new Intent(TopHits.this,MusicFinder.class);
                startActivity(seeDetails);
            }
        });
    }
}
