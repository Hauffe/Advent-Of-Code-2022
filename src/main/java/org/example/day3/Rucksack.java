package org.example.day3;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Rucksack {

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day3"));
        Scanner scanner = new Scanner(path);

        int midle, sum = 0;
        char letter;
        String first_half;
        String last_half;
        List<Character> chars = new ArrayList<>();

//        read line by line
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            midle = Math.abs(line.length()/2);
            first_half = line.substring(0, midle);
            last_half = line.substring(midle);
            chars.clear();

            for(int pos = 0; pos < first_half.length(); pos++){
                letter = first_half.charAt(pos);
                if(last_half.contains(letter+"")){
                    if(!chars.contains(letter)){
                        chars.add(letter);
                    }
                }
            }
            for (Character ch : chars){
                int value = (int)ch;
                if(value > 96){
                    sum += value-96;
                }else{
                    sum+= value-64+26;
                }
            }

        }
        scanner.close();
        System.out.println(sum);
    }
}

