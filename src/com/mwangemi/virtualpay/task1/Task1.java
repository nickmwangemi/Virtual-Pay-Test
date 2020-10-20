package com.mwangemi.virtualpay.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the desired length: ");
        int length = scanner.nextInt();

        String output = checkString(sentence,length);
        System.out.println(output);
    }

    static String checkString(String sentence, int length){
        if(sentence.length() <= length){
            return "Output: "+sentence;
        } else if (sentence.length()>length){
            return "Output: "+ sentence.substring(0,length);
        }
        else return "Invalid";
    }
}
