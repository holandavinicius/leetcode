package com.maia.vinicius.two_sum;

// Developed by: Vinicius Maia

/*
--------------------- ANSWER ------------------------------

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complementation = target - nums[i];
            if(map.containsKey(complementation)){
                return new int[]{map.get(complementation), i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}