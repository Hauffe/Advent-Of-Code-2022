package org.example.commonCases;

import java.util.ArrayList;
import java.util.List;

public class ex7 {
    /*
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) {
        // Write your code here
        Integer area = 0;
        area+= (A.size()*A.get(0).size())*2;

        //front
        List<Integer> temp = new ArrayList<>();
        for(int a =0; a<A.size(); a++){
            temp.add(0);
        }
        System.out.println(temp);
        System.out.println(A);
        for(int col = 0; col<A.size(); col++){
            for(int pos = 0; pos<A.size(); pos++){
                System.out.println("front" + A.get(pos).get(col));
                area+=Math.max(A.get(pos).get(col) - (temp.get(pos)), 0);
                temp.set(pos, A.get(pos).get(col));
            }
        }

        // left
        temp.clear();
        for(int a =0; a<A.size(); a++){
            temp.add(0);
        }
        System.out.println(temp);
        System.out.println(A);
        for(int col = 0; col<A.size(); col++){
            for(int pos = 0; pos<A.size(); pos++){
                System.out.println("back" + A.get(col).get(pos));
                area+=Math.max(A.get(col).get(pos) - (temp.get(pos)), 0);
                temp.set(pos, A.get(col).get(pos));
            }
        }


        // look right
        temp.clear();
        for(int a =0; a<A.size(); a++){
            temp.add(0);
        }
        System.out.println(temp);
        System.out.println(A);
        for(int col = A.size()-1; col>=0; col--){
            for(int pos = A.size()-1; pos>=0; pos--){
                System.out.println("back" + A.get(col).get(pos));
                area+=Math.max(A.get(col).get(pos) - (temp.get(pos)), 0);
                temp.set(pos, A.get(col).get(pos));
            }
        }

        //lookback
        temp.clear();
        for(int a =0; a<A.size(); a++){
            temp.add(0);
        }
        System.out.println(temp);
        System.out.println(A);
        for(int col = A.size()-1; col>=0; col--){
            for(int pos = A.size()-1; pos>=0; pos--){
                System.out.println("back" + A.get(pos).get(col));
                area+=Math.max(A.get(pos).get(col) - (temp.get(pos)), 0);
                temp.set(pos, A.get(pos).get(col));
            }
        }

        return area;
    }

}

