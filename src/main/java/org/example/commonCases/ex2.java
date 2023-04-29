package org.example.commonCases;

import java.util.HashSet;
import java.util.Set;

public class ex2 {
    public int getDistictValue(StringBuilder s){
        int size = 0, temp = 0;
        for(char c: s.toString().toCharArray()){
            temp = (int)s.toString().chars().filter(val-> val != c).count();
            if(temp>size){
                size = temp;
            }
        }
        return size;
    }

    public int solution(String P, String Q) {
        Set<String> permutations = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder p = new StringBuilder(P);
        StringBuilder q = new StringBuilder(Q);
        int min = P.length();
        permutations.add(q.toString());
        permutations.add(p.toString());
        for(int pos = 0; pos<P.length(); pos++){
            int tmp = 0;
            p.setCharAt(pos, q.charAt(pos));
            tmp = getDistictValue(p);
            if(tmp<min) min = tmp;
            permutations.add(p.toString());
            p.setLength(0);
            p.append(P);

            q.setCharAt(pos, p.charAt(pos));
            tmp = getDistictValue(p);
            if(tmp<min) min = tmp;
            permutations.add(q.toString());
            q.setLength(0);
            q.append(Q);
        }
        System.out.print(permutations);
        return min;
    }
}
