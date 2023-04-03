package org.example.day2;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RockPaperSisors {

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day2"));
        Scanner scanner = new Scanner(path);

        int sum = 0;
        int first = 0, seccond = 0, third = 0;

//        read line by line
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            line.charAt(0);
            line.charAt(2);
        }

        scanner.close();

        }
    }

