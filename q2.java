
// 2. Add Two Numbers
public class q2 {

    public void print(ListNode l) {
        while(l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int sum = 0;
        ListNode p = res;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;
        }

        return res.next;
    }

    public static void main(String[] args) {
        q2 sol = new q2();
        ListNode l1 = new ListNode(6);

        ListNode l2 = new ListNode(5);

        ListNode res = sol.addTwoNumbers(l1, l2);

        sol.print(res);
    }
}
