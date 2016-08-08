package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button for navigation to the now playing screen
        Button nowPlayingTextView = (Button) findViewById(R.id.now_playing_button);

        //on click listener for navigating to the now playing activity
        View.OnClickListener nowPlayingListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent startNowPlayingActivity = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(startNowPlayingActivity);
            }
        };
        nowPlayingTextView.setOnClickListener(nowPlayingListener);

        // recycler view placeholder for artists on the device
        TextView recyclerViewPlaceHolder = (TextView) findViewById(R.id.song_recycler_view);

        // onclick listener for an artist in the list
        View.OnClickListener selectedArtist = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startSongActivity = new Intent(MainActivity.this, SongActivity.class);
                startActivity(startSongActivity);
            }
        };
        recyclerViewPlaceHolder.setOnClickListener(selectedArtist);

        // button to navigate to either the google play app or open google play in web browser
        Button googlePlayButton = (Button) findViewById(R.id.google_play_button);

        // onclick listener for google play button
        View.OnClickListener googlePlayListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startGooglePlay = new Intent(MainActivity.this, GooglePlayActivity.class);
                startActivity(startGooglePlay);
            }
        };
        googlePlayButton.setOnClickListener(googlePlayListener);
    }
}
