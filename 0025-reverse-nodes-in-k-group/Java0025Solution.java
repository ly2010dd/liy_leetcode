public class Java0025Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        // 1->2->3->4->5-6->7->8
        // 1. 设置start和end如果数组不足k个直接返回head不用反转
        ListNode start = head;
        ListNode end = getKGroupEnd(start, k);
        if (end == null) {
            return head;
        }
        // 2. 先确定最终的head位置是第一组的end
        head = end;
        // 3. 先把第一组1->3反转 (4<-)1<-2-<3 4->5-6->7->8
        reverse(start, end);
        // 4. 标记上一组的结尾节点lastEnd即是1
        ListNode lastEnd = start;
        // 5. 从第二组开始按组循环反转
        while (lastEnd.next != null) {
            // 走到下一组开头即是4->5->6
            start = lastEnd.next;
            end = getKGroupEnd(start, k);
            if (end == null) {
                return head;
            }
            // 反转4->6即(4<-)1<-2-<3 (7-<)4<-5<-6 7->8
            reverse(start, end);
            // 调整上一轮的结尾节点lastEnd即1，lastEnd.next的指向最新一组被反转的end即6，即(6<-)1<-2-<3 (7-<)4<-5<-6 7->8
            lastEnd.next = end;
            // lastEnd变为4-6这轮的end即4
            lastEnd = start;
        }
        // 链表长度正好是k的整数倍时返回这里
        return head;
    }

    public ListNode getKGroupEnd(ListNode start, int k) {
        while (--k > 0 && start != null) {
            start = start.next;
        }
        return start;
    }

    public void reverse(ListNode start, ListNode end) {
        // 1. end后移
        end = end.next;
        // 2. curr
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = start;
        // 3. 反转
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 4. 重新设置尾指针
        start.next = end;
    }

}