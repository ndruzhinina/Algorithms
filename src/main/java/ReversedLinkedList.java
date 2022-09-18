class ReversedLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        if (head == null)
            return head;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null)
            return head;
        ListNode reversed = new ListNode(head.val);
        while (head.next != null) {
            head = head.next;
            reversed = new ListNode(head.val, reversed);
        }
        return reversed;
    }


    public static void print(ListNode head) {
        {
            ListNode node = head;
            while (node != null) {
                System.out.print(node.val);
                node = node.next;
                if (node != null)
                    System.out.print(" -> ");
            }
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        print(head);
        print(reverseList(head));
        print(reverseList2(head1));

    }
}


class ListNode {

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