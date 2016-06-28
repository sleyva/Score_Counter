package com.example.android.scorecounter;

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
    int scoreA = 0;
    int scoreB = 0;

    //Event handlers for Team A buttons
    public void threePointA(View view){
        scoreA = scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void twoPointA(View view){
        scoreA = scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA = scoreA+=1;
        displayForTeamA(scoreA);
    }

    //Event Handlers for Team B buttons
    public void threePointB(View view){
        scoreB = scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void twoPointB(View view){
        scoreB = scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB = scoreB+=1;
        displayForTeamB(scoreB);
    }

    //Reset button
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }
}
