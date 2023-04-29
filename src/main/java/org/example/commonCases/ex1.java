package org.example.commonCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1{
    public void exercise(){
        String test = "header,header\nNULL,nill\nANULLABLE,None\nNONE,nill";
        StringBuilder sb = new StringBuilder();
        List<String> str = new ArrayList<>(Arrays.asList(test.split("\n")));
        List<String> toRemove = new ArrayList<>();
        str.forEach(row ->{
            if(row.contains("NULL,") || row.contains(",NULL") || row.contains(",NULL,")){
                toRemove.add(row);
            }
        });
        str.removeAll(toRemove);
        sb.append(str.get(0));
        for(int pos = 1; pos<str.size(); pos++){
            sb.append("\n").append(str.get(pos));
        }
        System.out.println(sb);
    }
}
