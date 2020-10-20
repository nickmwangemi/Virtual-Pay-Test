package com.mwangemi.virtualpay.task2;

import java.util.Scanner;

public class Task2 {
    static char[] swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first word");
        String first = scanner.nextLine();
        System.out.println("enter second word");
        String second = scanner.nextLine();

        System.out.println();
        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();

        if (firstString.length == secondString.length) {
            for (int i = 0; i < firstString.length - 1; i++) {
                String secondSwapped = new String(swap(second, i, i + 1));
                if(first.compareToIgnoreCase(secondSwapped) == 0)
                    System.out.println("move letter "+secondString[i]+" to the right");

            }
            System.out.println();
            for (int i = firstString.length - 1; i > 0; i--) {
                String secondSwapped = new String(swap(second, i, i - 1));
                if(first.compareToIgnoreCase(secondSwapped) == 0)
                    System.out.println("move letter "+secondString[i]+" to the left");
            }
        } else{
            System.out.println("Impossible");
        }
    }
}