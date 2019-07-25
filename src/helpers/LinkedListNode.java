package helpers;

public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;

    public LinkedListNode() {
    }

    public LinkedListNode(int data, LinkedListNode next, LinkedListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public LinkedListNode(int d) {
        this.data = d;
    }

    public void setNext(LinkedListNode n) {
        this.next = n;
        if (this == last) {
            this.last = n;
        }
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        this.prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    public LinkedListNode clone() {
        LinkedListNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data, next2, null);

        return head2;
    }
}
