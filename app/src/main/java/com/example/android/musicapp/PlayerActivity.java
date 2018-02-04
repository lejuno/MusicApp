package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // Buttons
        setupClickListener(R.id.id_button_return, MainActivity.class);
        setupClickListener(R.id.id_button_search, RandomSongFinderActivity.class);
    }

    private void setupClickListener(int id, final Class<? extends Activity> clazz) {
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerActivity.this, clazz);
                startActivity(intent);
            }
        });
    }

    public void goToPreviousSong(View v) {
        Toast.makeText(this, "Previous Song", Toast.LENGTH_SHORT).show();
    }

    public void playSong(View v) {
        Toast.makeText(this, "Play Song", Toast.LENGTH_SHORT).show();
    }

    public void pauseSong(View v) {
        Toast.makeText(this, "Pause Song", Toast.LENGTH_SHORT).show();
    }

    public void goToNextSong(View v) {
        Toast.makeText(this, "Next Song", Toast.LENGTH_SHORT).show();
    }
}
