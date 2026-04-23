# Find Customer Referee

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-find-customer-referee` |
| Topics | Database |
| Solved | 2026-04-23 |
| Runtime | 479 ms (beats 81.43700000000005%) |
| Memory | 0B (beats 100%) |

## Problem Statement

Table: `Customer`

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

 

Find the names of the customer that are either:

	- **referred by** any customer with `id != 2`.

	- **not referred by** any customer.

Return the result table in **any order**.

The result format is in the following example.

 

**Example 1:**

**Input:** 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
**Output:** 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+

## Hints

<details>
<summary>Hint 1</summary>

Be careful of the NULL value

</details>

## Solutions

```MySQL
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2 OR referee_id is NULL;
```
