/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reverseNode = head.next;
        head.next = null;

        while (reverseNode.next != null) {
            ListNode temp = reverseNode.next;
            reverseNode.next = head;
            head = reverseNode;
            reverseNode = temp;
        }
        reverseNode.next = head;
        return reverseNode;
    }
}
