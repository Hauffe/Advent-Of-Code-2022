package org.example.utils;

import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    private static ReadFile instance = new ReadFile();
    private final String commonDir = "C:\\Users\\Alexandre\\IdeaProjects\\advent-of-code\\src\\main\\java\\org\\example\\";
    private final Map<String, String> files = new HashMap<>();

    private ReadFile (){
        files.put("Day1", commonDir + "day1\\calories.txt");
        files.put("Day2", commonDir + "day2\\rockPaperSisors.txt");
        files.put("Day3", commonDir + "day3\\Rucksack.txt");
        files.put("Day4", commonDir + "day4\\CampCleanup.txt");
        files.put("Day5", commonDir + "day5\\SupplyStacks.txt");
    }

    public static ReadFile getInstance(){
        return instance;
    }

    public String getFile(String key) {
        return this.files.get(key);
    }
}
