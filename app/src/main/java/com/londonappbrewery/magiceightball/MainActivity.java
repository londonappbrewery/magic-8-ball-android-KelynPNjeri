package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.makeDecision);
        final ImageView eightBall = findViewById(R.id.eightBall);
        final int[] imageArray = {
          R.drawable.ball1,
          R.drawable.ball2,
          R.drawable.ball3,
          R.drawable.ball4,
          R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8-Ball", "I was clicked!");

                Random indexGenerator = new Random();
                int indexNumber =indexGenerator.nextInt(5);

                eightBall.setImageResource(imageArray[indexNumber]);
            }
        });

    }
}
