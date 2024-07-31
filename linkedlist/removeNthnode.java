package linkedlist;

public class removeNthnode {


        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode first = dummy;
            ListNode second = dummy;

            // Move first pointer to the n+1 position
            for (int i = 0; i <= n; i++) {
                first = first.next;
            }

            // Move both pointers until first reaches the end
            while (first != null) {
                first = first.next;
                second = second.next;
            }

            // Remove the Nth node from the end
            second.next = second.next.next;

            return dummy.next;
        }
    public static void main(String[] args) {
        removeNthnode solution = new removeNthnode();
        removeNthnode.ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int n = 2;
        removeNthnode.ListNode newHead = solution.removeNthFromEnd(head, n);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    }

