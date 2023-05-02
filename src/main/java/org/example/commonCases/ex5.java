package org.example.commonCases;

import java.util.Collections;
import java.util.List;

public class ex5 {
    public static int lilysHomework(List<Integer> arr) {
        // Write your code here
        int swaps = 0;
        for(int pos = 0; pos < arr.size(); pos++){
            int pos2 = pos+1;
            int min_pos = pos;
            while(pos2<arr.size()){
                if(arr.get(pos2) < arr.get(min_pos)){
                    min_pos = pos2;
                }
                pos2++;
            }
            if(min_pos != pos){
                System.out.println(pos+"<-"+min_pos);
                Collections.swap(arr, min_pos, pos);
                //or
                //arr.set(pos, arr.get(min_pos));
                swaps++;
                System.out.println(arr);
            }

        }
        return swaps;
    }
}
