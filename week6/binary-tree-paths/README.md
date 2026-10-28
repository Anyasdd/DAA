1. We have a binary tree. We need to find all paths from the root to the leaves.Each path should be returned as string
2. I start from the root and save the path as string. When I move to a child I add its value to the string.When I reach a leaf I add the complete path to the result list
3. Time Complexity: O(n × h) Here n is the number of nodes, and h is the height of the tree.I visit all nodes and creating path strings can take up to O(h) time for each node when the path values have a fixed size
