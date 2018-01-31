package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Should Send Action to Detail View with specific Song Names
        setupClickListener(R.id.id_item_1, RandomSongActivity.class);
        setupClickListener(R.id.id_item_2, RandomSongActivity.class);
        setupClickListener(R.id.id_item_3, RandomSongActivity.class);
        setupClickListener(R.id.id_item_4, RandomSongActivity.class);
        setupClickListener(R.id.id_item_5, RandomSongActivity.class);
        setupClickListener(R.id.id_item_6, RandomSongActivity.class);

        // Buttons
        setupClickListener(R.id.id_button_return, MainActivity.class);
        setupClickListener(R.id.id_button_search, MusicFinderActivity.class);
    }

    private void setupClickListener(int id, final Class<? extends Activity> clazz) {
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryActivity.this, clazz);
                startActivity(intent);
            }
        });
    }
}
