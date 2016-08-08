package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //load the album art for the album the song that is now playing
        Picasso.with(this)
                .load(R.drawable.brick_in_the_wall)
                .into((ImageView)findViewById(R.id.now_playing_image_view));

        // button to navigate to either the google play app or open google play in web browser
        Button googlePlayButton = (Button) findViewById(R.id.google_play_button);

        // onclick listener for google play button
        View.OnClickListener googlePlayListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startGooglePlay = new Intent(NowPlayingActivity.this, GooglePlayActivity.class);
                startActivity(startGooglePlay);
            }
        };
        googlePlayButton.setOnClickListener(googlePlayListener);
    }


}
