package linked.lists;

import helpers.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList test = new MiddleOfTheLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int value = test.middleNode(head).value;
    }
}
