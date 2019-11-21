package linked.lists;

import helpers.ListNode;

import java.util.HashSet;

public class RemoveDuplicates {

    public void deleteDuplicates(ListNode n) {
        HashSet<Integer> set = new HashSet<>();
        ListNode previous = null;

        while (n != null) {
            if (set.contains(n.value)) {
                previous.next = n.next;
            } else {
                set.add(n.value);
                previous = n;
            }

            n = n.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);

        RemoveDuplicates rm = new RemoveDuplicates();
        rm.deleteDuplicates(head);
    }
}
