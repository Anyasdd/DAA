1. We have a binary tree and a target number. We need to check if there is a path from the root to a leaf with this sum
2. I subtract the current node value from the target sum.Then I check the left and right children. When I reach a leaf, I check if its value is equal to the remaining sum
3. Time Complexity is O(n). In the worst case I check every node
