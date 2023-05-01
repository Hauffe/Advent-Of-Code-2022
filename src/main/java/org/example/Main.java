package org.example;

import org.example.day5.SupplyStacks;

import java.io.IOException;
import java.util.Arrays;

public class Main {


    // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0]-numbers[1];
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}