package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA=0,scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void points_3(View view ){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void points_2(View view ){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void points_free_throw(View view ){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void points_3_B(View view ){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void points_2_B(View view ){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void points_free_throw_B(View view ){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }
}
