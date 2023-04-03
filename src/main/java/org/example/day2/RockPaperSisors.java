package org.example.day2;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockPaperSisors {

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day2"));
        Scanner scanner = new Scanner(path);
        Map<String, Boolean> rules = new HashMap<>(){
            {
                put("AZ", false); // rock - scissors
                put("BX", false); // paper - rock
                put("CY", false); // scissors - paper
                put("AY", true); // rock - paper
                put("BZ", true); // paper - scissors
                put("CX", true); // scissors - rock
            }
        };

//        (1 for Rock, 2 for Paper, and 3 for Scissors)
        Map<Character, Integer> values = new HashMap<>(){
            {
                put('X', 1);
                put('Y', 2);
                put('Z', 3);
            }
        };

        int total_score = 0;

//        read line by line
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            char play = line.charAt(2);
            String match = line.replace(" ", "");
            if(rules.get(match) == null){
                total_score += values.get(play) + 3;
            }else{
                if(rules.get(match)){
                    total_score += values.get(play) + 6;
                }else{
                    total_score += values.get(play);
                }
            }
        }
        scanner.close();

        System.out.println("Total score: " + total_score);

        }
    }

