package LinkedLists;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseOrder {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        Deque<ListNode> nodeStack = new ArrayDeque<>();
        while(head != null){
            nodeStack.push(head);
            head = head.next;
        }
        ListNode newHead = nodeStack.peek();

        while(!nodeStack.isEmpty()){
            ListNode node = nodeStack.pop();
            if(!nodeStack.isEmpty()){
                node.next = nodeStack.peek();
            }else{
                node.next = null;
            }
        }
        return newHead;
    }
}
