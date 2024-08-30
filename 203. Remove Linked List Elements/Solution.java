package com.data;

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

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
      ListNode current = head;
		  ListNode prev = null;

		  while (current != null) {
		    if (current.val == val) {
		      if (prev == null) {
		        head = current.next;
		      } else {
		        prev.next = current.next;
		      }
		      current = current.next;
		    } else {
		      prev = current;
		      current = current.next;
		    }
		  }

		  return head;
		
	
    
}
}