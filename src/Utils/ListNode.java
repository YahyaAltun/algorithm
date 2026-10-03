package Utils;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) sb.append(" -> ");
            curr = curr.next;
        }
        return sb.toString();
    }
}
