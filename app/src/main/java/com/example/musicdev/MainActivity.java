package com.example.musicdev;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
MediaPlayer player;
public void play(View view){
   player.start();
    Toast.makeText(this, "Play the music", Toast.LENGTH_SHORT).show();
}
    public void pause(View view){
        player.pause();
        Toast.makeText(this, "pause the music", Toast.LENGTH_SHORT).show();
    }
    public void stop(View view){
        player.stop();
        Toast.makeText(this, "music was stop, please launch the app again", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player=MediaPlayer.create(this,R.raw.music);
        MediaController mediaController = new MediaController(this);
        
    }
}