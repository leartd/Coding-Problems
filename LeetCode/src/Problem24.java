/**
 * Created by Leart Doko on 7/7/2016.
 */
public class Problem24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        first.next = second.next;
        second.next = first;

        swapPairsPlus(first, first.next);
        return second;
    }

    public ListNode swapPairsPlus(ListNode precog, ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        first.next = second.next;
        second.next = first;

        precog.next = second;
        swapPairsPlus(first, first.next);
        return second;

    }
}
