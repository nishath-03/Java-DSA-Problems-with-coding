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
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> ls = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(ListNode i:lists){
            ListNode temp = i;
            while(temp!=null){
                res.add(temp.val);
                temp=temp.next;
            }
            
        }Collections.sort(res);
        if(res.isEmpty())
           return null;
        ListNode head=new ListNode(res.get(0));
        ListNode temp = head;
        for(int i=1;i<res.size();i++){
            temp.next=new ListNode(res.get(i));
            temp=temp.next;
            
        }temp.next=null;
        // System.out.print(res);
        return head;
    }
}