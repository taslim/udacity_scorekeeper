package com.taslimokunola.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int shotTeamA = 0;
    int foulTeamA = 0;

    int goalTeamB = 0;
    int shotTeamB = 0;
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method to add one goal for Team A
     */

    public void displayGoalForTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Method to add one shot for Team A
     */

    public void displayShotForTeamA(View v) {
        shotTeamA = shotTeamA + 1;
        displayShotForTeamA(shotTeamA);
    }

    /**
     * Method to add one foul for Team A
     */

    public void displayFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Method to add one goal for Team
     */


    public void displayGoalForTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * Method to add one shot for Team B
     */


    public void displayShotForTeamB(View v) {
        shotTeamB = shotTeamB + 1;
        displayShotForTeamB(shotTeamB);
    }

    /**
     * Method to add one foul for Team B
     */


    public void displayFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Method to reset everything
     */

    public void resetScore(View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        shotTeamA = 0;
        shotTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayShotForTeamA(shotTeamA);
        displayShotForTeamB(shotTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given goal for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shot for Team A.
     */
    public void displayShotForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shot);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Team B.
     */

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shot for Team B.
     */

    public void displayShotForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shot);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team B.
     */

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

}
