package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Buy Toast
        Button buyButton = (Button) findViewById(R.id.id_buy_song);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Payment.this, "Purchase Complete", Toast.LENGTH_SHORT).show();
            }
        });



        // Buttons
        Button returnButton = (Button) findViewById(R.id.id_button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToMain = new Intent(Payment.this,MainActivity.class);
                startActivity(returnToMain);
            }
        });

        Button searchButton = (Button) findViewById(R.id.id_button_search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeDetails = new Intent(Payment.this,MusicFinder.class);
                startActivity(seeDetails);
            }
        });
    }
}
