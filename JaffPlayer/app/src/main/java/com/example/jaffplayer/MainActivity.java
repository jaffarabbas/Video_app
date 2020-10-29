package com.example.jaffplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video_view = findViewById(R.id.video);
        video_view.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.clip2);
        MediaController controls = new MediaController(this);
        video_view.setMediaController(controls);
        controls.setAnchorView(video_view);
        video_view.start();
    }
}