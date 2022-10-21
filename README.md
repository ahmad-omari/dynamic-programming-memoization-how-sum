# Dynamic Programming Memoization "How Sum"

The function ‘howSum(targetSum, numbers, memo)‘ that takes in a
targetSum of Integer, array of numbers and a memo map as arguments.

* The function returns an array containing any combination of elements that add up to exactly the targetSum. If there is no combination that adds up the targetSum then return null.
* Using an element of the array multiple times is allowed.
* Notice that all input numbers are non-negative numbers.

# Complexity

Assume that:
m = targetSum
n = numbers array length

Time Complexity is O (n * m^2)
Space Complexity is O (m)