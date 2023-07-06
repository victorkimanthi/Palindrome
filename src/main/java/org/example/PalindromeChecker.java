package org.example;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean checkIfPalindrome(String s) {

        //i represents the index of the string from the left while j represents index of the string from the right
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;
    }

        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter a sentence");
                String sentence = scanner.nextLine();

                boolean isPalindrome = checkIfPalindrome(sentence);
                System.out.println(isPalindrome);
            }

        }
    }
