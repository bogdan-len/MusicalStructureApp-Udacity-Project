package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView backToLibrary = (TextView) findViewById(R.id.back_button_text);
        backToLibrary.setText(R.string.back_to_library);

        backToLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent nowPlayingIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(nowPlayingIntent);
            }
        });


    }
}