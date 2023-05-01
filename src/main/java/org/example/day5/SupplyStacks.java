package org.example.day5;

import org.example.utils.ReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SupplyStacks {

    public static void exercise() throws IOException {
        Path path = Paths.get(ReadFile.getInstance().getFile("Day5"));
        Scanner scanner = new Scanner(path);
        Integer block = 0;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            Map<Integer, List<String>> queues;
            List<String> lastBlock = new ArrayList<>();
            List<String> lines = new ArrayList<>();
            // - read untill find "" (empty)
            if(line.isEmpty()){
                block++;
            }
            //read first block
            if(block == 0){
                // - create String[] for the line
                lines.add(line);
                // - get last values for the columns
                // - - walk the string[] from bottom to top Map<Intger, List<String>>

            //read seccond block
            }else if(block == 1){
            // separate by command (move, from, to)
            // manipulate the arrays
            }
        }
        scanner.close();
    }
}
