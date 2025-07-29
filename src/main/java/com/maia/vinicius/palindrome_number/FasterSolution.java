package com.maia.vinicius.palindrome_number;

// Developed by: Vinicius Maia

public class FasterSolution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;

        int num = x;
        int reverseNum = 0;

        while(num > 0){
            int last = num % 10;
            reverseNum = reverseNum * 10 + last;
            num = num / 10;
        }
        return reverseNum == x;
    }
}