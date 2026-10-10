package LinkedList.Hard;

/**
 * L25
 */
public class L25 {
    public static class ListNode {
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
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevgrpend=dummy;
        
        while (true) {
            ListNode kth= prevgrpend;
            for (int i = 0; i < k; i++) {
                kth=kth.next;
                if (kth==null ) {
                    return dummy.next;
                }
            }
            ListNode nextgrpsat=kth.next;
            ListNode prev=kth.next;
            ListNode curr=prevgrpend.next;
            while (curr!=nextgrpsat) {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode oldgrpstat=prevgrpend.next;
            prevgrpend.next=kth;
            prevgrpend=oldgrpstat;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ans = reverseKGroup(head, 2);
        ListNode curr = ans;
        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.next;
        }
    }
}