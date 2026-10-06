package LinkedList.Easy;

import java.util.List;

public class L19 {
    public static  class ListNode {
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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s=new ListNode(0);
        ListNode slow=s;
        ListNode fast=head;
        slow.next=head;
        for (int i = 1; i <=n; i++) {
            fast=fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        
        return s.next;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next = new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode ans=removeNthFromEnd(head, 2);
        ListNode curr=ans;
        while (curr!=null) {
            System.out.print(curr.val);
            curr=curr.next;
        }

    }
}
