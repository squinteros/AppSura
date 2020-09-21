package com.example.pruebasura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Menu extends AppCompatActivity {

    private BlankFragment frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        //Fragment
         frag = new BlankFragment();
    }

    public void Archivos(View v)
    {

        Intent archivos = new Intent(this, Archivos.class);
        startActivity(archivos);
    }

    public void Animation(View v){

        Intent i = new Intent(this, BlankFragment.class);
        startActivity(i);
    }
}
