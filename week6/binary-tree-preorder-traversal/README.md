1. We have a binary tree. We need to return all node values in preorder. Preorder means root, left, right
2. First, I add the current node value to the result list. Then I visit the left child and the right child. If the node is null, I stop
3. Time Complexity: O(n). Every node is visited once
