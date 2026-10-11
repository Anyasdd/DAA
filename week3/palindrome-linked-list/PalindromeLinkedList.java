public class PalindromeLinkedList{

    class Solution {
        public boolean isPalindrome(ListNode head) {
            java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();

            ListNode current = head;

            while (current != null) {
                nums.add(current.val);
                current = current.next;
            }

            int left = 0;
            int right = nums.size() - 1;

            while (left < right) {
                if (!nums.get(left).equals(nums.get(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

}