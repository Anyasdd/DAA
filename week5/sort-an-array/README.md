1. We have an array of numbers. We need to sort the numbers from smallest to largest without using built-in sorting functions
2. I use Merge Sort to solve this problem. First I divide the array into two parts and continue dividing until each part has only one number. Then I compare the numbers and merge the parts in sorted order
3. Time Complexity is O(n log n). The array is divided into two parts many times. There are about log n levels, and merging the numbers takes O(n) time at each level
4. 