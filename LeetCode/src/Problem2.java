/**
 * Created by Leart Doko on 10/24/2015.
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersEdit(l1, l2, 0);
    }

    public ListNode addTwoNumbersEdit(ListNode l1, ListNode l2, int extra) {
        if (l1 == null && l2 == null) {
            if (extra == 0) {
                return null;
            } else {
                return new ListNode(extra);
            }
        }

        ListNode result = new ListNode(extra);
        if (l1 != null) {
            result.val += l1.val;
        }
        if (l2 != null) {
            result.val += l2.val;
        }

        if (result.val >= 10) {
            extra = 1;
            result.val = result.val % 10;
        } else {
            extra = 0;
        }

        result.next = addTwoNumbersEdit(l1 != null ? l1.next : null, l2 != null ? l2.next : null, extra);
        return result;
    }
}
