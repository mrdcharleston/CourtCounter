package com.courtcounter;

/**
 * Created by darrylcharleston on 5/9/18.
 */

public class Game {
    // Team a score value.
    private int mTeamAScore;
    // Team b score value.
    private int mTeamBScore;

    // Returns team a score
    public int getTeamAScore(){
        return this.mTeamAScore;
    }
    // Returns team b score
    public int getTeamBScore(){
        return this.mTeamBScore;
    }

    // Adds one point to team a score
    public void addOnePointToTeamA(){
        this.mTeamAScore += 1;
    }

    // Adds one point to team b score
    public void addOnePointToTeamB(){
        this.mTeamAScore += 1;
    }

     // Adds two points to team a score
    public void addTwoPointToTeamA(){
        this.mTeamAScore  += 2;
    }
    // Adds two points to team b score
    public void addTwoPointToTeamB(){
        this.mTeamAScore  += 2;
    }

    // Adds three points to team a score
    public void addThreePointsToTeamA(){
        this.mTeamAScore += 3;
    }

    // Adds three points to team b score
    public void addThreePointsToTeamB(){
        this.mTeamAScore += 3;
    }
    //Resets the score
    public void resetScore(){
        this.mTeamAScore = 0;
        this.mTeamBScore = 0;
    }
}