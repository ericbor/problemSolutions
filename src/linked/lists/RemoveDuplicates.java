package linked.lists;

import helpers.Node;

import java.util.HashSet;

public class RemoveDuplicates {

    public void deleteDuplicates(Node n) {
        HashSet<Integer> set = new HashSet<>();
        Node previous = null;

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
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        RemoveDuplicates rm = new RemoveDuplicates();
        rm.deleteDuplicates(head);
    }
}
