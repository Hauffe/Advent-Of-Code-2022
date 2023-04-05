package org.example.day1;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calories {

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day1"));
        Scanner scanner = new Scanner(path);
        int sum = 0;
        int first = 0, seccond = 0, third = 0;

//      read line by line
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            if(!line.isBlank()){
                sum += Integer.parseInt(line);
            }else{
                if (sum > first){
                    seccond = first;
                    first = sum;
                } else if (sum > seccond) {
                    third = seccond;
                    seccond = sum;
                } else if (sum > third) {
                    third = sum;
                }
                sum = 0;
            }
        }

        scanner.close();

        System.out.println("1 "+first);
        System.out.println("2 "+seccond);
        System.out.println("3 "+third);
        System.out.println("total "+ (first+seccond+third));
    }
}
