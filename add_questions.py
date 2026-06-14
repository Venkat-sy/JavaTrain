import os

problems = {
    "ArrayLeftRotation": """Array Left Rotation
A left rotation operation on an array shifts each of the array's elements 1 unit to the left. Given an array a of n integers and a number, d, perform d left rotations on the array.
Input: a = [1, 2, 3, 4, 5], d = 4
Output: [5, 1, 2, 3, 4]
Explanation: When we perform 4 left rotations, the array undergoes the following sequence of changes: [1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]""",
    
    "BestTimeBuySell": """121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.""",

    "FairCandySwap": """888. Fair Candy Swap
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has. Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy.
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Explanation: Alice gives 1 candy to Bob, Bob gives 2 candies to Alice. Both end up with 3 candies total.""",

    "GroupAnagram": """49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation: "eat", "tea", "ate" are grouped. "tan", "nat" are grouped. "bat" is grouped alone.""",

    "MajorityElement": """169. Majority Element
Given an array nums of size n, return the majority element. The majority element is the element that appears more than floor(n / 2) times.
Input: nums = [3,2,3]
Output: 3
Explanation: 3 occurs twice, which is more than 3/2 = 1 times.""",

    "MaxSubArrSum": """53. Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.""",

    "MergeSortedArray": """88. Merge Sorted Array
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6] inside nums1.""",

    "MinInRotSortedArray": """153. Find Minimum in Rotated Sorted Array
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Given the sorted rotated array nums of unique elements, return the minimum element of this array.
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.""",

    "MissingMinimum": """41. First Missing Positive (Missing Minimum Positive)
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array. 3 is the smallest missing positive integer.""",

    "MissingPositive": """41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.""",

    "MovingZero": """283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Explanation: Non-zero elements 1,3,12 retain order and 0s are moved to end.""",

    "PivotIndex": """724. Find Pivot Index
Given an array of integers nums, calculate the pivot index of this array. The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation: The pivot index is 3. Left sum = 1 + 7 + 3 = 11. Right sum = 5 + 6 = 11.""",

    "RemoveDuplicatesFromSortedArray": """26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.""",

    "RotateImage": """48. Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Explanation: The matrix is rotated 90 degrees clockwise.""",

    "SearchInsertPosition": """35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
Input: nums = [1,3,5,6], target = 5
Output: 2
Explanation: 5 is found at index 2.""",

    "SetMatrixZeroes": """73. Set Matrix Zeroes
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: The element at (1,1) is 0, so row 1 and col 1 become 0.""",

    "SortColors": """75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Explanation: 0 represents red, 1 represents white, and 2 represents blue.""",

    "SquaresOfASortedArray": """977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].""",

    "ThirdMaximumNumber": """414. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Input: nums = [3,2,1]
Output: 1
Explanation: The first distinct maximum is 3, second is 2, third is 1.""",

    "TopKFreequent": """347. Top K Frequent Elements
Given an integer array nums and an integer k, return the k most frequent elements.
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Explanation: 1 appears 3 times, 2 appears 2 times, which are the top 2 frequent elements.""",

    "BuildingH2O": """1115. Print FooBar Alternately (Building H2O variation)
There are two kinds of threads: oxygen and hydrogen. Your goal is to group these threads to form water molecules.
Input: water = "HOH"
Output: "HHO"
Explanation: Two hydrogen threads and one oxygen thread will output HHO.""",

    "FizzBuzzDemo": """1195. Fizz Buzz Multithreaded
You have four functions: fizz, buzz, fizzbuzz, and number. Implement a multithreaded version of FizzBuzz.
Input: n = 15
Output: [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11,"fizz",13,14,"fizzbuzz"]
Explanation: Classic fizzbuzz logic but executed by 4 different threads.""",

    "PrintOrder": """1114. Print in Order
Suppose we have a class Foo with methods first(), second(), and third(). Ensure they execute in order first -> second -> third when called by different threads.
Input: nums = [1,2,3]
Output: "firstsecondthird"
Explanation: Regardless of the order threads are fired, the output will always be firstsecondthird.""",

    "DemoQuick": """Quick Sort Algorithm
Implement Quick Sort algorithm to sort an array.
Input: nums = [3,2,1,5,4]
Output: [1,2,3,4,5]
Explanation: Array is sorted using quick sort partitioning.""",

    "LRUCache": """146. LRU Cache
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
Input: ["LRUCache", "put", "put", "get"]
Output: [null, null, null, 1]
Explanation: Put (1,1), Put (2,2), Get (1) returns 1.""",

    "ClimbingStairs": """70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top: 1 step + 1 step, or 2 steps.""",

    "ClimbViaDP": """70. Climbing Stairs (via DP)
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top: 1+1+1, 1+2, 2+1.""",

    "CoinChangeViaDP": """322. Coin Change
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money. Return the fewest number of coins that you need to make up that amount.
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1.""",

    "EditDistance": """72. Edit Distance
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2. Allowed operations: Insert, Delete, Replace.
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: horse -> rorse -> rose -> ros.""",

    "HouseRobber": """198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. Return the maximum amount of money you can rob tonight without alerting the police (cannot rob adjacent houses).
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.""",

    "JumpGame": """55. Jump Game
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position. Return true if you can reach the last index, or false otherwise.
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.""",

    "LCS": """1143. Longest Common Subsequence
Given two strings text1 and text2, return the length of their longest common subsequence.
Input: text1 = "abcde", text2 = "ace"
Output: 3
Explanation: The longest common subsequence is "ace" and its length is 3.""",

    "LIS": """300. Longest Increasing Subsequence
Given an integer array nums, return the length of the longest strictly increasing subsequence.
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.""",

    "PrefixPostViaRecursion": """Prefix and Postfix Sum via Recursion
Using recursion, compute the prefix and postfix sum of an array.
Input: [1, 2, 3]
Output: Prefix: [1, 3, 6], Postfix: [6, 5, 3]
Explanation: Calculates sums iteratively or recursively from left and right.""",

    "UniquePAthGrid": """62. Unique Paths
There is a robot on an m x n grid. The robot is initially located at the top-left corner. The robot can only move either down or right at any point in time. Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
Input: m = 3, n = 7
Output: 28
Explanation: Using DP, calculates the number of ways to reach bottom right corner.""",

    "CountOverlap": """435. Non-overlapping Intervals
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.""",

    "GAsStation": """134. Gas Station
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i]. You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation: Start at station 3 (index 3) and fill up with 4 unit of gas. You can travel around the circuit.""",

    "MeetingRooms": """252. Meeting Rooms
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Explanation: The intervals overlap, so a person cannot attend all.""",

    "PowerOfThree": """326. Power of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.
Input: n = 27
Output: true
Explanation: 27 = 3^3.""",

    "ReverseBits": """190. Reverse Bits
Reverse bits of a given 32 bits unsigned integer.
Input: n = 00000010100101000001111010011100
Output: 964176192 (00111001011110000010100101000000)
Explanation: The input binary string represents 43261596, output represents 964176192.""",

    "SingleNumber": """136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Input: nums = [2,2,1]
Output: 1
Explanation: 1 appears only once.""",

    "CarFleet": """853. Car Fleet
There are n cars going to the same destination along a one-lane road. The destination is target miles away. You are given two integer array position and speed. Return the number of car fleets that will arrive at the destination.
Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
Output: 3
Explanation: The cars starting at 10 and 8 form a fleet, 5 and 3 form a fleet, and 0 forms a fleet.""",

    "DailyTemperatures": """739. Daily Temperatures
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Explanation: Returns an array with days until a warmer temp is found.""",

    "Histogram": """84. Largest Rectangle in Histogram
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The largest rectangle is shown between index 2 and 3.""",

    "MostWater": """11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.""",

    "SlidingWindowMax": """239. Sliding Window Maximum
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. Return the max sliding window.
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: Slide the window of size 3 and find the maximum at each step.""",

    "SlidingWindowMinimum": """Sliding Window Minimum
You are given an array of integers nums, there is a sliding window of size k. Return the min sliding window.
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [-1, -3, -3, -3, 3, 3]
Explanation: Slide the window of size 3 and find the minimum at each step.""",

    "ValidParentheses": """20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Input: s = "()[]{}"
Output: true
Explanation: The string contains valid matching brackets in correct order.""",

    "FindCharInList": """2942. Find Words Containing Character
You are given a 0-indexed array of strings words and a character x. Return an array of indices representing the words that contain the character x.
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.""",

    "NonRepeatSubStr": """3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.""",

    "StoneJewels": """771. Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. You want to know how many of the stones you have are also jewels.
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Explanation: There are 3 stones that are jewels.""",

    "UniqueMorseCode": """804. Unique Morse Code Words
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter, return the number of different transformations among all words we have.
Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: There are 2 different transformations: "--...-." and "--...--.".""",

    "ValidPalindrome": """125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.""",

    "WordBreak": """139. Word Break
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".""",

    "WordPattern": """290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation: Words correspond to pattern characters accurately."""
}

default_problem = """Generic Problem
Problem Description
Input: Example Input
Output: Example Output
Explanation: Explanatory text"""

for root, dirs, files in os.walk('.'):
    for file in files:
        if file.endswith('.java'):
            filepath = os.path.join(root, file)
            filename = file[:-5]
            
            # Skip if already has comment block at top to avoid duplicating
            with open(filepath, 'r', encoding='utf-8') as f:
                content = f.read()
                
            if content.strip().startswith('/*'):
                continue
                
            problem_text = problems.get(filename, default_problem)
            comment_block = "/*\n" + problem_text + "\n*/\n"
            
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(comment_block + content)

print("Updated all files with problem descriptions.")
