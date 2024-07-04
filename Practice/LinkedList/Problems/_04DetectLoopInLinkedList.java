/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            ListNode curr = temp;
            if(temp.val == -99999) return true;
            temp.val = -99999;
            temp = temp.next;
            curr.next = null;
        }
        return false;
    }
}





/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // if(head==null || head.next == null) return false;

        // ListNode temp = head;
        // while(temp!=null){
        //     ListNode curr = temp;
        //     if(temp.val == -99999) return true;
        //     temp.val = -99999;
        //     temp = temp.next;
        //     curr.next = null;
        // }
        // return false;

        // ListNode fast = head;
        // ListNode slow = head;
        // while(fast==null || fast.next==null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if(fast == slow) return true;
        // }
        // return false;

        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there's a cycle
            if (slow == fast) return true;
        }

        return false;
    }
}



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
