1. We have a binary tree. We need to find its maximum depth. Maximum depth is the number of nodes in the longest path from the root to a leaf
2. I use recursion. If the node is null I return 0. I find the depth of the left and right parts. Then I take the larger number and add 1 for the current node
3. Time Complexity is O(n). Every node is visited once
