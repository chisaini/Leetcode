package LinkedList.Easy;

public class L206 {
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

    public static  ListNode reverseList(ListNode head) {
        
        ListNode curr= head;
        ListNode prev=null;
        while (curr!=null) {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;


    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode newhead=reverseList(head);
        ListNode curr=newhead;
        while (curr!=null) {
            System.out.print(curr.val);
            curr=curr.next;
        }
    }
}
