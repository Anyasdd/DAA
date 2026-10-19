public class SortList {

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode slow = head;
            ListNode fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode second = slow.next;
            slow.next = null;

            ListNode left = sortList(head);
            ListNode right = sortList(second);

            return merge(left, right);
        }

        private ListNode merge(ListNode a, ListNode b) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (a != null && b != null) {
                if (a.val <= b.val) {
                    current.next = a;
                    a = a.next;
                } else {
                    current.next = b;
                    b = b.next;
                }

                current = current.next;
            }

            if (a != null) {
                current.next = a;
            } else {
                current.next = b;
            }

            return dummy.next;
        }
    }

}