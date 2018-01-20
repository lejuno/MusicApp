package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Music Finder Activity
        Button searchButton = (Button) findViewById(R.id.id_bt_musicFinder);
        // Set onClickListener to go to MusicFinder Activity
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finderIntent = new Intent(MainActivity.this, MusicFinder.class);
                startActivity(finderIntent);
            }
        });

        // Top Hits
        TextView tvTopHits = (TextView) findViewById(R.id.id_tx_top_hits);
        tvTopHits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topHitsIntent = new Intent(MainActivity.this, TopHits.class);
                startActivity(topHitsIntent);
            }
        });

        // History
        TextView tvHistory = (TextView) findViewById(R.id.id_tx_history);
        tvHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyIntent = new Intent(MainActivity.this, History.class);
                startActivity(historyIntent);
            }
        });

        // Payment
        TextView tvPayment = (TextView) findViewById(R.id.id_tx_payment);
        tvPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(MainActivity.this, Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
