/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                head.next=head1;
                head1=head1.next;
            }
            else{
                head.next=head2;
                head2=head2.next;
            }
            head=head.next;
        }

        if(head1!=null){
            head.next=head1;
        }
        else{
            head.next=head2;
        }

        return dummy.next;

    }
}