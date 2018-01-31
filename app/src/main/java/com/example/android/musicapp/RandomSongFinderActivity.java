package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RandomSongFinderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_song_finder);

        // Lets search for the song
        setupClickListener(R.id.id_found_song, DetailedSongActivity.class);

        // Buttons
        setupClickListener(R.id.id_button_return, MainActivity.class);
        setupClickListener(R.id.id_button_detail, DetailedSongActivity.class);
        setupClickListener(R.id.id_button_buy, PaymentActivity.class);
    }

    private void setupClickListener(int id, final Class<? extends Activity> clazz) {
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomSongFinderActivity.this, clazz);
                startActivity(intent);
            }
        });
    }
}
