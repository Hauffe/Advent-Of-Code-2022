package org.example.utils;

import lombok.*;

import java.util.HashMap;
import java.util.List;

public class ReadFile {
    private static ReadFile instance = new ReadFile();
    private final String commonDir = "C:\\Users\\Alexandre\\IdeaProjects\\advent-of-code\\src\\main\\java\\org\\example\\";
    private final HashMap<String, String> files = new HashMap<>();

    private ReadFile (){
        files.put("Day1", commonDir + "day1\\calories.txt");
        files.put("Day2", commonDir + "day2\\rockPaperSisors.txt");
    }

    public static ReadFile getInstance(){
        return instance;
    }

    public String getFile(String key) {
        return this.files.get(key);
    }
}