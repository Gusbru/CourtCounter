package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    /**
     *
     * @param score display the score for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scores_A);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * @param view increase 3 points when button is clicked
     */
    public void increase3Points(View view) {
        score += 3;
        displayForTeamA(score);
    }

    /**
     *
     * @param view increase 2 points when button is clicked
     */
    public void increase2Points(View view) {
        score += 2;
        displayForTeamA(score);
    }

    /**
     *
     * @param view increase 1 point when button is clicked
     */
    public void increase1Points(View view) {
        score += 1;
        displayForTeamA(score);
    }

}
