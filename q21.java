public class q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // edge case
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode res = new ListNode(0, null);
        if(l1.val < l2.val) {
            res.val = l1.val;
            res.next = mergeTwoLists(l1.next, l2);
        }
        else {
            res.val = l2.val;
            res.next = mergeTwoLists(l1, l2.next);
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
