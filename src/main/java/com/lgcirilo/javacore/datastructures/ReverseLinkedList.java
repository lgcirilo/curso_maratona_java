package com.lgcirilo.javacore.datastructures;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode reversed;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ReverseLinkedList rev = new ReverseLinkedList();
        reversed = rev.reverse(head);
        System.out.println();
    }

    public ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = head;
        while (next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
