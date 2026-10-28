1. We have two binary trees. We need to merge them into one tree. If two nodes are in the same position, we add their values.If only one node exists, we keep that node
2. First, I check if one of the nodes is null. If the first node is null, I return the second node. If the second node is null, I return the first node. If both nodes exist, I add their values. Then I merge the left and right children in the same way
3. Time Complexity: O(n + m)  n and m are the numbers of nodes in the two trees. In the worst case, I visit nodes from both trees 
