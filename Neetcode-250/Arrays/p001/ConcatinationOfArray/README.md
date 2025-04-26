# 🧩 001 - Concatenation of Array

**Link:** [LeetCode Problem](https://leetcode.com/problems/concatenation-of-array/)  
**Category:** NeetCode 250 - Arrays  
**Difficulty:** Easy

---

## 📝 Problem Statement

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that:

- `ans[i] == nums[i]`
- `ans[i + n] == nums[i]`  
  For all `0 <= i < n`.

Return the array `ans`.

---

## ✅ Examples

**Example 1:**
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]

markdown
Copy
Edit

**Example 2:**
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]

yaml
Copy
Edit

---

## 🧠 Approach

Two ways implemented:

### 1. Basic loop
- Iterate from 0 to n
- Copy each value twice into result array

### 2. `System.arraycopy()`
- Uses Java's native method to copy arrays efficiently

---

## ⏱️ Time & Space Complexity

| Version             | Time Complexity | Space Complexity |
|---------------------|------------------|------------------|
| Basic Loop          | O(n)             | O(2n)            |
| System.arraycopy()  | O(n)             | O(2n)            |

---

## 🔄 Alternate Tags

`Array`, `Simulation`, `Beginner Java`, `NeetCode 250`