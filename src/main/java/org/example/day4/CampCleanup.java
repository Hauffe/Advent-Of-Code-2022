package org.example.day4;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;




public class CampCleanup {

    public static boolean checkContains(int[]one, int[]two){
        return (
                one[0] <= two[0] && one[1] >= two[1])
                ||
                (two[0] <= one[0] && two[1] >= one[1]
        ); //6-6,4-6
    }

    //2-4,6-8 - one[1]<two[0] two[1]<one[0]
    public static boolean checkOverlaps(int[]one, int[]two){
        return !(one[1]<two[0] || two[1]<one[0]);
    }

    public static int[] buildSequence(String row){
        StringBuilder sb = new StringBuilder();
        String[] values = row.split("-"); //2-4 -> 2 and 4
        int fist = Integer.parseInt(values[0]); // "2" -> 2
        int last = Integer.parseInt(values[1]); // "4" -> 4
        return new int[]{fist, last};
    }

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day4"));
        Scanner scanner = new Scanner(path);
        int count=0;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] rows  = line.split(","); // 2-4,6-8 -> 2-4 and 6-8
//            boolean result1 = checkContains(buildSequence(rows[0]), buildSequence(rows[1]));
            boolean result2 = checkOverlaps(buildSequence(rows[0]), buildSequence(rows[1]));
            System.out.println(result2);
            if(result2) count++;
        }
        scanner.close();
        System.out.println(count);
    }
}
