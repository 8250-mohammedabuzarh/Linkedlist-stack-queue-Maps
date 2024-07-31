package linkedlist;

public class detectCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    ListNode start = head;
                    while (start != slow) {
                        start = start.next;
                        slow = slow.next;
                    }
                    return start;
                }
            }

            return null;
        }

    public static void main(String[] args) {
        detectCycle solution = new detectCycle();
        detectCycle.ListNode head = solution.new ListNode(3);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(0);
        head.next.next.next = solution.new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        detectCycle.ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }

    }

