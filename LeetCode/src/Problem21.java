/**
 * Created by Leart Doko on 10/28/2015.
 */

import java.util.Stack;

/**
 * Definition for singly-linked list.
 */
public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode newList = null;
        ListNode startPoint = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && (l2 == null || l1.val <= l2.val)) {
                if (startPoint == null) {
                    newList = new ListNode(l1.val);
                    startPoint = newList;
                } else {
                    newList.next = new ListNode(l1.val);
                    newList = newList.next;
                }
                l1 = l1.next;
            }

            if (l2 != null && (l1 == null || l2.val <= l1.val)) {
                if (startPoint == null) {
                    newList = new ListNode(l2.val);
                    startPoint = newList;
                } else {
                    newList.next = new ListNode(l2.val);
                    newList = newList.next;
                }
                l2 = l2.next;
            }
        }
        return startPoint;
    }
}
