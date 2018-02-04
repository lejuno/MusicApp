package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TopHitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_hits);

        // Should Send Action to Detail Activity with specific Song Names
        setupClickListener(R.id.id_item_1, DetailedSongActivity.class);
        setupClickListener(R.id.id_item_2, DetailedSongActivity.class);
        setupClickListener(R.id.id_item_3, DetailedSongActivity.class);
        setupClickListener(R.id.id_item_4, DetailedSongActivity.class);
        setupClickListener(R.id.id_item_5, DetailedSongActivity.class);
        setupClickListener(R.id.id_item_6, DetailedSongActivity.class);

        // Should Send Action to Payment Activity
        setupClickListener(R.id.id_buy_item_1, PaymentActivity.class);
        setupClickListener(R.id.id_buy_item_2, PaymentActivity.class);
        setupClickListener(R.id.id_buy_item_3, PaymentActivity.class);
        setupClickListener(R.id.id_buy_item_4, PaymentActivity.class);
        setupClickListener(R.id.id_buy_item_5, PaymentActivity.class);
        setupClickListener(R.id.id_buy_item_6, PaymentActivity.class);

        // Buttons
        setupClickListener(R.id.id_button_return, MainActivity.class);
        setupClickListener(R.id.id_button_search, RandomSongFinderActivity.class);
    }

    private void setupClickListener(int id, final Class<? extends Activity> clazz) {
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopHitsActivity.this, clazz);
                startActivity(intent);
            }
        });
    }
}
