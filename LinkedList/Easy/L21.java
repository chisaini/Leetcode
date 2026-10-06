package LinkedList.Easy;

public class L21 {
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
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode curr=head;
        while (list1!=null&&list2!=null) {
            if (list1.val>=list2.val) {
                curr.next=list2;
                list2=list2.next;
                curr=curr.next;
            }else{
                curr.next=list1;
                list1=list1.next;
                curr=curr.next;
            }
        }
        if (list1!=null) {
            curr.next=list1;
        }else {
            curr.next=list2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next= new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);
        ListNode head=mergeTwoLists(head1, head2);
        ListNode curr=head;
        while (curr!=null) {
            System.out.println(curr.val);
            curr=curr.next;
        }


    }
}
