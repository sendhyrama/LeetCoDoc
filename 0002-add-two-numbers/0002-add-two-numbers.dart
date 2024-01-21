/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? addTwoNumbers(ListNode? l1, ListNode? l2) {
    ListNode dummy = ListNode(0);
    ListNode current = dummy;
    int carry = 0;

    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        
        // Calculate & update the sum, carry
        int sum = x + y + carry;
        carry = sum ~/ 10;

        // Add new node with sum %10 then move to the next node
        current.next = ListNode(sum % 10);
        current = current.next!;
        
        // Move to the next node in each linked list if avail
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }

    if (carry > 0) {
      current.next = ListNode(carry);
    }

    return dummy.next;
  }
}