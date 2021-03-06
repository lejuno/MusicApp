package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My Songs Activity
        setupClickListener(R.id.id_tx_my_songs, MySongsActivity.class);

        // Music Finder Activity
        setupClickListener(R.id.id_bt_musicFinder, RandomSongFinderActivity.class);

        // Top Hits
        setupClickListener(R.id.id_tx_top_hits, TopHitsActivity.class);

        // PaymentActivity
        setupClickListener(R.id.id_tx_payment, PaymentActivity.class);
    }

    private void setupClickListener(int id, final Class<? extends Activity> clazz) {
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, clazz);
                startActivity(intent);
            }
        });
    }
}
