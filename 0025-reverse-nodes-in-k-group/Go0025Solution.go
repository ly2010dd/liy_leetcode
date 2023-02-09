// Package _025_reverse_nodes_in_k_group Description:
//
// Author: milesyli
// Date: 2023/2/10 12:33 AM
package _025_reverse_nodes_in_k_group

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseKGroup(head *ListNode, k int) *ListNode {
	// 递归法
	// 1->2->3->4->5->6->7->8 head=1 end=1
	end := head
	for i := 0; i < k; i++ {
		if end == nil {
			return head
		}
		end = end.Next
	}
	// head=1 end=4
	newHead := reverse(head, end)
	head.Next = reverseKGroup(end, k)
	return newHead
}

func reverse(start *ListNode, end *ListNode) *ListNode {
	// prev=4
	prev := end
	var next *ListNode
	for start != end {
		next = start.Next
		start.Next = prev
		prev = start
		start = next
	}
	return prev
}
