/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode start = head;
        do {
            ListNode nextNode = head.next;
            while (nextNode != null && nextNode.val == head.val) {
                head.next = nextNode.next;
                nextNode = nextNode.next;
            }
            head = nextNode;
        } while (head != null);

        return start;
    }
}
