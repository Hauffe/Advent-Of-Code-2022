package org.example.commonCases;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public int solution(int[] A) {
        List<Integer> values = new ArrayList<>();
        Integer unpaired = 0;
        for(int val : A){
            values.add(val);
        }
        for(Integer num : values){
            int count = (int)values.stream().filter(val -> val == num).count();
            if(count < 2){
                unpaired = num;
            }
        }
        return unpaired;
    }

    // more performatic

    public int solution2(int[] A) {
        List<Integer> values = new ArrayList<>();
        for(int val : A){
            if(values.contains(val)){
                values.remove((Integer)val);
            }else{
                values.add(val);
            }
        }
        return values.get(0);
    }
}
