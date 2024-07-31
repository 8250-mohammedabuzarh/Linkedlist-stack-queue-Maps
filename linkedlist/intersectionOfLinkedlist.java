package linkedlist;

public class intersectionOfLinkedlist {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists, switching heads when reaching the end
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        intersectionOfLinkedlist solution = new intersectionOfLinkedlist();
        intersectionOfLinkedlist.ListNode headA = solution.new ListNode(4);
        headA.next = solution.new ListNode(1);
        intersectionOfLinkedlist.ListNode headB = solution.new ListNode(5);
        headB.next = solution.new ListNode(6);
        headB.next.next = solution.new ListNode(1);
        intersectionOfLinkedlist.ListNode intersect = solution.new ListNode(8);
        intersect.next = solution.new ListNode(4);
        intersect.next.next = solution.new ListNode(5);
        headA.next.next = intersect;
        headB.next.next.next = intersect;

        intersectionOfLinkedlist.ListNode intersectionNode = solution.getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
