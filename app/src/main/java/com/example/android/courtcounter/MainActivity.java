package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.courtcounter.Game;


public class MainActivity extends AppCompatActivity {
    //import of teamA class
    Game teamA = new Game();
    Game teamB = new Game();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates a textView object for team A
        final TextView teamAScore = findViewById(R.id.team_a_score);

        //Creates a textView object for team A
        final TextView teamBScore = findViewById(R.id.team_b_score);

        //Creates button object team a
        final Button teamAFreeThrow = findViewById(R.id.free_throw_for_team_a);
        Button teamATwoPoints = findViewById(R.id.two_points_for_team_a);
        Button teamAThreePoints = findViewById(R.id.three_ponts_for_team_a);

        //Creates button object team b
        Button teamBFreeThrow = findViewById(R.id.free_throw_for_team_b);
        Button teamBTwoPoints = findViewById(R.id.two_points_for_team_b);
        Button teamBThreePoints = findViewById(R.id.three_points_for_team_b);

        Button reset = findViewById(R.id.reset_score);

        //Resets the game
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.resetScore();
                teamB.resetScore();
                teamAScore.setText(Integer.toString(teamA.getTeamBScore()));
                teamBScore.setText(Integer.toString(teamB.getTeamBScore()));
            }
        });


        // Adds one point for team a and displays score
        teamAFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.addOnePointToTeamA();
                teamAScore.setText(Integer.toString(teamA.getTeamAScore()));
            }
        });
        // Adds two points for team a and displays score
        teamATwoPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.addTwoPointToTeamA();
                teamAScore.setText(Integer.toString(teamA.getTeamAScore()));
            }
        });
        // Adds three points for team a and displays score
        teamAThreePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.addThreePointsToTeamA();
                teamAScore.setText(Integer.toString(teamA.getTeamAScore()));
            }
        });
        // Adds one point for team b and displays score
        teamBFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB.addOnePointToTeamA();
                teamBScore.setText(Integer.toString(teamB.getTeamAScore()));
            }
        });
        // Adds two points for team b and displays score
        teamBTwoPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB.addTwoPointToTeamA();
                teamBScore.setText(Integer.toString(teamB.getTeamAScore()));
            }
        });
        // Adds three points for team b and displays score
        teamBThreePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB.addThreePointsToTeamA();
                teamBScore.setText(Integer.toString(teamB.getTeamAScore()));
            }
        });


    }
}
