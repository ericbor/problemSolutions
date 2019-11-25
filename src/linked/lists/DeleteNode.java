package linked.lists;

import helpers.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        DeleteNode test = new DeleteNode();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        test.deleteNode(head.next);
    }
}
