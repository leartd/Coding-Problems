/**
 * Created by Leart Doko on 7/7/2016.
 */
public class Problem141 {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode tail = head.next;
        if(tail == null)
            return false;

        while(head != null && tail != null && head != tail){
            head = head.next;
            tail = tail.next;
            if(tail == null){
                return false;
            }else{
                tail = tail.next;
            }

            if(tail == null){
                return false;
            }
        }

        return true;
    }
}
