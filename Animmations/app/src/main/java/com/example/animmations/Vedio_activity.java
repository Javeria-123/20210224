package com.example.animmations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaRecorder;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Vedio_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);

        VideoView videoView=findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/" + R.raw.video2);

        MediaController mediaControll=new MediaController(this);
        mediaControll.setAnchorView(videoView);
        videoView.setMediaController(mediaControll);
        videoView.start();
    }
}