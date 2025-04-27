# 217. Contains Duplicate

**LeetCode Link**: [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  
**Difficulty**: Easy

---

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## Example 1

Input: nums = [1,2,3,1] Output: true

shell
Copy
Edit

## Example 2

Input: nums = [1,2,3,4] Output: false

shell
Copy
Edit

## Example 3

Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true

ruby
Copy
Edit

---

## Approaches

### 1. Brute Force (Nested Loops)

- Compare each element with every other element.
- Return `true` if a duplicate is found.

### 2. HashSet (Optimized)

- Use a `HashSet` to track seen elements.
- If the element already exists in the set, return `true`.

---

## Time and Space Complexity

| Approach          | Time Complexity | Space Complexity |
|:-----------------:|:---------------:|:----------------:|
| Brute Force        | O(n²)            | O(1)             |
| HashSet (Optimized)| O(n)             | O(n)             |

---

## Tags

- Arrays
- HashSet