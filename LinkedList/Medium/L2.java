package LinkedList.Medium;



public class L2 {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head =new ListNode(0);
        ListNode curr=head;
        ListNode curr1=l1;
        ListNode curr2=l2;
        int c=0;
        while (curr1!=null||curr2!=null) {
            int sum=c;
            if (curr1!=null) {
                sum+=curr1.val;
                curr1=curr1.next;
            }
            if (curr2!=null) {
                sum+=curr2.val;
                curr2=curr2.next;
            }

            c=sum/10;
            sum=sum%10;
            
            curr.next=new ListNode(sum);
            curr=curr.next;
            
            
        }
        if (c!=0) {
            curr.next=new ListNode(c);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head1=new ListNode(2);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(3);
        ListNode head2=new ListNode(5);
        head2.next=new ListNode(6 );
        
        ListNode head=addTwoNumbers(head1, head2);
        ListNode curr=head;
        while (curr!=null) {
            System.out.print(curr.val);
            curr=curr.next;
        }

    }
}
