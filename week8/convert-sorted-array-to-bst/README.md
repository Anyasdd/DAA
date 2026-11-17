1. We have an array of numbers sorted from smallest to largest. We need to create a balanced binary search tree from this array. The left side should contain smaller numbers, and the right side should contain larger number
2. First, I find the middle element of the array. I make this element the root of the tree. Then I use the left half to build the left subtree and the right half to build the right subtree. I repeat these steps until there are no numbers lef
3. Time Complexity: O(n). Each number becomes a tree node exactly once

