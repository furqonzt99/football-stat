package com.furqon.footballstat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int goalTeamA, foulTeamA, yellowCardTeamA, redCardTeamA, goalTeamB, foulTeamB, yellowCardTeamB, redCardTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayScoreForTeamA(goalTeamA);
    }

    private void displayScoreForTeamA(int goalTeamA) {
        TextView scoreView = findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(goalTeamA));
    }

    public void foulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    private void displayFoulForTeamA(int foulTeamA) {
        TextView foulView = findViewById(R.id.foul_team_a);
        foulView.setText(String.valueOf(foulTeamA));
    }

    public void yellowCardForTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardTeamA(yellowCardTeamA);
    }

    private void displayYellowCardTeamA(int yellowCardTeamA) {
        TextView yellowCardView = findViewById(R.id.yellow_card_team_a);
        yellowCardView.setText(String.valueOf(yellowCardTeamA));
    }

    public void redCardForTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardTeamA(redCardTeamA);
    }

    private void displayRedCardTeamA(int redCardTeamA) {
        TextView redCardView = findViewById(R.id.red_card_team_a);
        redCardView.setText(String.valueOf(redCardTeamA));
    }

    public void goalForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayScoreForTeamB(goalTeamB);
    }

    private void displayScoreForTeamB(int goalTeamB) {
        TextView scoreView = findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(goalTeamB));
    }

    public void foulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    private void displayFoulForTeamB(int foulTeamB) {
        TextView foulView = findViewById(R.id.foul_team_b);
        foulView.setText(String.valueOf(foulTeamB));
    }

    public void yellowCardForTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardTeamB(yellowCardTeamB);
    }

    private void displayYellowCardTeamB(int yellowCardTeamB) {
        TextView yellowCardView = findViewById(R.id.yellow_card_team_b);
        yellowCardView.setText(String.valueOf(yellowCardTeamB));
    }

    public void redCardForTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardTeamB(redCardTeamB);
    }

    private void displayRedCardTeamB(int redCardTeamB) {
        TextView redCardView = findViewById(R.id.red_card_team_b);
        redCardView.setText(String.valueOf(redCardTeamB));
    }

    public void resetAll(View view) {
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
        displayYellowCardTeamA(0);
        displayYellowCardTeamB(0);
        displayRedCardTeamA(0);
        displayRedCardTeamB(0);

    }
}
