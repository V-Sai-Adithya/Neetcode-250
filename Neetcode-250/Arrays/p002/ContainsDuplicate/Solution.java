package p002.ContainsDuplicate;

// Problem Title: Contains Duplicate
// LeetCode Link: https://leetcode.com/problems/contains-duplicate/
// Tags: Arrays, HashSet
// Time Complexity:
// - Brute Force: O(n^2)
// - HashSet: O(n)
// Space Complexity:
// - Brute Force: O(1)
// - HashSet: O(n)

import java.util.HashSet;

public class Solution {

    // Change this line to switch between approaches:
    private static final int SOLUTION_VERSION = 2;

    public boolean containsDuplicate(int[] nums) {
        if (SOLUTION_VERSION == 1) {
            return bruteForce(nums);
        } else if (SOLUTION_VERSION == 2) {
            return usingHashSet(nums);
        }
        // Default fallback
        return false;
    }

    // Brute Force approach
    // Compare every element with every other element
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    private boolean bruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized approach using HashSet
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private boolean usingHashSet(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

