package com.maia.vinicius.palindrome_number;

// Developed by: Vinicius Maia

// Given an integer x, return true if x is a palindrome, and false otherwise.

public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int divisor = recursiveMod(x, 1);
        System.out.println(divisor);

        while (x != 0) {
            int left = x / divisor;
            int right = x % 10;

            if (left != right) {
                return false;
            }

            x = (x % divisor) / 10;

            divisor /= 100;
        }

        return true;

    }

    public static int recursiveMod(int x, int divisor) {
        if (x / divisor < 10) {
            return divisor;
        }
        return recursiveMod(x, divisor * 10);
    }
}