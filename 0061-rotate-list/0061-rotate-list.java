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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode org = head;
        ListNode last=null;

       int cnt=1;
       if(head==null)return org;
        while(head.next != null){
            cnt++;
            head = head.next;
        }
        k = k % cnt;
        if (k == 0) return org;
        for(int i=0;i<k;i++){
            ListNode temp=org;
            while(temp.next.next!=null){
                
                
                temp = temp.next;
                
            }
            last = temp.next;
            temp.next=null;
            last.next=org;
            org = last;
        }return org;
    }
}