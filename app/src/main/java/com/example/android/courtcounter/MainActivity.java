package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_NORMAL_THROW = 2;
    final int POINTS_FOR_LONG_THROW = 3;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * method that display the scoreTeamA for team A
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.scores_A);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.scores_B);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * @param view increase 3 points when button is clicked
     */
    public void increase3PointsTeamA(View view) {
        scoreTeamA += POINTS_FOR_LONG_THROW;
        displayForTeamA();
    }

    public void increase3PointsTeamB(View view) {
        scoreTeamB += POINTS_FOR_LONG_THROW;
        displayForTeamB();
    }

    /**
     * @param view increase 2 points when button is clicked
     */
    public void increase2PointsTeamA(View view) {
        scoreTeamA += POINTS_FOR_NORMAL_THROW;
        displayForTeamA();
    }

    public void increase2PointsTeamB(View view) {
        scoreTeamB += POINTS_FOR_NORMAL_THROW;
        displayForTeamB();
    }

    /**
     * @param view increase 1 point when button is clicked
     */
    public void increase1PointsTeamA(View view) {
        scoreTeamA += POINTS_FOR_FREE_THROW;
        displayForTeamA();
    }

    public void increase1PointsTeamB(View view) {
        scoreTeamB += POINTS_FOR_FREE_THROW;
        displayForTeamB();
    }

}
