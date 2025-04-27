import java.util.*;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0); 
    ListNode current = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int val1 = (l1 != null) ? l1.val : 0;
      int val2 = (l2 != null) ? l2.val : 0;

      int total = val1 + val2 + carry;
      carry = total / 10;
      int digit = total % 10;

      current.next = new ListNode(digit);
      current = current.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
      }

      return dummy.next;
    }

    public static void main(String[] args) {
      ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
      ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

      AddTwoNumbers solution = new AddTwoNumbers();
      ListNode result = solution.addTwoNumbers(l1, l2);

      while (result != null) {
        System.out.print(result.val);
        if (result.next != null) System.out.print(" -> ");
      result = result.next;
    }
  }
}



