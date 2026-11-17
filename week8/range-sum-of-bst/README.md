1. We have a binary search tree and two numbers - low and high. We need to find the sum of all node values between these two numbers, including low and high
2. First, I check if the current node is null. If it is null, I return 0. If the node value is smaller than low, I only check the right side. If the node value is larger than high, I only check the left side. If the value is inside the range, I add it to the sum and check both children
3. Time Complexity: O(n). In the worst case, I may need to visit every node, but I can skip some branches because the tree is BST.

