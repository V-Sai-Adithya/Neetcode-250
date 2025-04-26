package p001.ConcatinationOfArray;

// Problem: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Tags: Arrays
// Difficulty: Easy
//
// Given an integer array nums of length n, return an array ans of length 2n such that:
// ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n.
//
// Time Complexity: O(n)
// Space Complexity: O(2n)

public class Solution {

    public int[] getConcatenation(int[] nums) {
        // Toggle between solutions by commenting/uncommenting just one line:

        return arrayCopyVersion(nums); // System.arraycopy version
        // return basicLoopVersion(nums); // Loop-based version
    }

    /**
     * Version 1: Basic loop version
     * - Time Complexity: O(n), where n = nums.length
     *   We iterate through the input array once and copy each element twice.
     * - Space Complexity: O(2n)
     *   A new array of size 2 * n is created to hold the result.
     */
    private int[] basicLoopVersion(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    /**
     * Version 2: Optimized version using System.arraycopy()
     * - Time Complexity: O(n), same as above, but copy is handled internally by JVM in native code.
     * - Space Complexity: O(2n), same as above.
     *
     * Syntax: System.arraycopy(sourceArray, sourceStartIndex, destArray, destStartIndex, length)
     */
    private int[] arrayCopyVersion(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
}
//Syntax for arraycopying : System.arraycopy(sourceArray, sourceStartIndex, destinationArray, destinationStartIndex, length);