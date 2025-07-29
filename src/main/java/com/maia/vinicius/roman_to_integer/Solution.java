package com.maia.vinicius.roman_to_integer;

/*
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("IV", 4);
        romans.put("V", 5);
        romans.put("IX", 9);
        romans.put("X", 10);
        romans.put("XL", 40);
        romans.put("L", 50);
        romans.put("XC", 90);
        romans.put("C", 100);
        romans.put("CD", 400);
        romans.put("D", 500);
        romans.put("CM", 900);
        romans.put("M", 1000);

        int value = 0;
        int i = 0;

        while (i < s.length()) {
            if (i + 1 < s.length()) {
                String doubleChar = s.substring(i, i + 2);
                if (romans.containsKey(doubleChar)) {
                    value += romans.get(doubleChar);
                    i += 2;
                    continue;
                }
            }
            String singleChar = s.substring(i, i + 1);
            value += romans.get(singleChar);
            i++;
        }
        return value;
    }

}
