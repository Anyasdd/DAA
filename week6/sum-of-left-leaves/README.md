 1.We have a binary tree. We need to find the sum of all left leaves
 2. First, I check if the tree is empty.Then I check the left child. If the left child is a leaf I add its value to the sum. If it is not a leaf I continue checking its children. I also check the right side because it can contain left leaves
 3. Time Complexity: O(n) In the worst case, I visit all nodes once   
