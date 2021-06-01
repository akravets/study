import java.util.List;

public class Leetcode206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode listNode = reverseList(node);
        System.out.println();
    }

    private static ListNode reverseList(ListNode head) {
        return reverseListRec(head, null);
    }

    private static ListNode reverseListRec(ListNode head, ListNode prev) {
        if(head == null){ //1
            return prev;
        }
        ListNode next = head.next; // null
        head.next = prev; // 2

        return reverseListRec(next, head); // null, 3
    }
}
