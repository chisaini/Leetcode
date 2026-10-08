package LinkedList.Easy;

public class L160 {
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while (true) {
            if (a==b) {
                return a;
            }
            if (a==null) {
                a=headB;
            }else{
                a=a.next;
            }if (b==null) {
                b=headA;
            }else{
                b=b.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(8);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(1);
        head2.next.next.next = head1.next.next;
        System.out.println(getIntersectionNode(head1, head2).val);

    }
}
