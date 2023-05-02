package org.example.commonCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex6 {

    //leaderboard
    public static List<Integer> exercise(List<Integer> ranked, List<Integer> player){
        List<Integer> leaderboard = new ArrayList<>();
        List<Integer> history = new ArrayList<>();
        int position = 1;
        int leaderposition = 0;
        for(Integer score: ranked){
            leaderboard.add(position);
            if(leaderposition+1<ranked.size()){
                if(ranked.get(leaderposition+1) != score){
                    position++;
                }
            }
            leaderposition++;
        }
        for(Integer play: player){
            for(int pos = 0; pos<leaderboard.size(); pos++){
                if(play>=ranked.get(pos)){
                    System.out.println(leaderboard.get(pos) + " = "+ ranked.get(pos) + " - " + pos);
                    history.add(leaderboard.get(pos));
                    break;
                }
                if(pos == leaderboard.size()-1){
                    history.add(leaderboard.get(pos)+1);
                }
            }
        }
        return history;
    }
}
