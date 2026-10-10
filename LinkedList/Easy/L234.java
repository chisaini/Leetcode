package LinkedList.Easy;

public class L234 {
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

    public static  boolean isPalindrome(ListNode head) {
        if (head.next==null) {
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        ListNode next=null;
        while (fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode start1=prev;
        ListNode start2=slow;
        if (fast!=null) {
            start2=start2.next;
        }
        
        while (start1!=null&&start2!=null) {
            if (start1.val!=start2.val) {
                return false;
            }
            start1=start1.next;
            start2=start2.next;
        }
        
            return true;
        
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
         head.next=new ListNode(2);
         head.next.next=new ListNode(2);
         head.next.next.next=new ListNode(1);
       
        
        
        System.out.println(isPalindrome(head));



    }
}
