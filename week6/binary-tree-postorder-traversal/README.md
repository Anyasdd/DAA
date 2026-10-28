1. We have a binary tree. We need to return all node values in postorder.Postorder means left, right, root
2. First, I visit the left child. Then I visit the right child. Finally, I add the current node value to the result list. If the node is null, I stop
3. Time Complexity: O(n). I visit every node once

