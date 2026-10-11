1. We have a sorted linked list. We need to remove duplicate numbers so that each number appears only once
2. I use a pointer like current to go through the list. I compare the current node with the next node. If their values are same, I skip next node. If they are different I move to next node
3. Time Complexity is O(n). We go through the list only once. Each node is checked at most once