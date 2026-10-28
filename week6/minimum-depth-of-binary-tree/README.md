1. We have a binary tree. We need to find the shortest path from the root to a leaf. A leaf is a node without children
2. I use recursion. If the tree is empty, I return 0. If a node has only one child, I continue with that child. If it has two children I find the depth of both sides and choose the smaller one
3. Time Complexity is O(n). In the worst case, I visit all nodes
