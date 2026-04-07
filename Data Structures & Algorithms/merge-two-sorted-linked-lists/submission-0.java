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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        
        ListNode ret = null;
        ListNode ans = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                if (ret == null) {
                    ret = new ListNode(temp1.val);
                    temp1 = temp1.next;
                    ans = ret;
                } else {
                    ret.next = temp1;
                    ret = ret.next;
                    temp1 = temp1.next;
                }
            } else if (temp1.val > temp2.val) {
                if (ret == null) {
                    ret = new ListNode(temp2.val);
                    temp2 = temp2.next;
                    ans = ret;
                } else {
                    ret.next = temp2;
                    ret = ret.next;
                    temp2 = temp2.next;
                }
            } else {
                if (ret == null) {
                    ret = new ListNode(temp1.val);
                    temp1 = temp1.next;
                    ans = ret;
                } else {
                    ret.next = temp1;
                    ret = ret.next;
                    temp1 = temp1.next;
                }
            }
        }

        while (temp1 != null) {
            ret.next = temp1;
            ret = ret.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ret.next = temp2;
            ret = ret.next;
            temp2 = temp2.next;
        }

        return ans;
    }
}