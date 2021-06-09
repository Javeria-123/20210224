package com.example.animmations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Audio extends AppCompatActivity {

    MediaPlayer mp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        mp=MediaPlayer.create(this,R.raw.audio);
       
    }

    public void play(View view) {
        mp.start();
    }

    public void stop(View view) {
        mp.stop();
    }
}