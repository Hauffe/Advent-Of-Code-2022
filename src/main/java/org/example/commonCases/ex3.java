package org.example.commonCases;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public int[] solution(int[] A, int K) {
        List<Integer> lst = new ArrayList<>();
        for(int a : A){
            lst.add(a);
        }
        int size = lst.size();
        if(size>0){
            while(K>0){
                Integer val = lst.get(lst.size()-1);
                lst.remove(lst.size()-1);
                lst.add(0,val);
                K--;
            }
            return lst.stream().mapToInt(i->i).toArray();
        }else{
            return A;
        }
    }

}
