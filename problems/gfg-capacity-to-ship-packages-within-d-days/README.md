# Capacity To Ship Packages Within D Days

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-capacity-to-ship-packages-within-d-days` |
| Topics | Array, Binary Search |

## Problem Statement

Given **arr[]** of weights, find the minimum boat capacity to ship all weights within **d** days.

- The items are loaded in the same order as their appearance.

- The total weight should not exceed the computed capacity on any day.

**Examples:**

**Input: **arr[] = [1, 2, 1], d = 2
**Output: **3
**Explanation: **We can ship with boat capacity 3 in 2 days.
Day 1- 1, 2
Day 2- 1

**Input:** arr[] = [9, 8, 10], d = 3
**Output: **10
**Explanation: **We can ship with boat capacity 10 in 3 days.
Day 1- 9
Day 2- 8
Day 3- 10
