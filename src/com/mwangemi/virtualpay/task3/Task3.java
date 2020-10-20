package com.mwangemi.virtualpay.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    static int numbers[]={1,2,5,6};

    public static void main(String[] args) {
        missingNumbers(numbers.length);
    }

    static public void missingNumbers (int n){

        System.out.print("Sorted Array: ");
        for (int j = 0; j <numbers.length; j++)
            System.out.print(numbers[j] +" ");

        System.out.print("\nNumbers missing in array :  ");

        int j = 0;
        int counter = numbers[0];
        List<Integer> results = new ArrayList<>();

        for(int i = counter; i <=numbers.length;  i++) {
            if (j < numbers.length && i == numbers[j])
                j++;
            else
                results.add(i);
                System.out.print(i + " ");
        }
        Collections.sort(results);
        System.out.println("\nRESULTS: " +results);
        System.out.println("\nSmallest number missing in array: "+results.get(0));
    }

}
