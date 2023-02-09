import java.lang.System;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; };
}

class Solution {
    public static void main(String[] args) {
        System.out.println("list1 size: ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        System.out.println("list1: ");
        ListNode list1 = null;
        for (int i = 0; i < size1; i++) {
            int val = sc.nextInt();
            if (list1 == null) {
                list1 = new ListNode(val);
                list1.next = null;
            } else {
                ListNode p = new ListNode(val);
                p.next = list1;
                list1 = p;
            }
        }
        //do {
        //    System.out.print(list1.val + " ");
        //    if (list1.next == null) break;
        //    else list1 = list1.next;
        //} while( true );
        //System.out.println();

        System.out.println("list2 size: ");
        int size2 = sc.nextInt();
        System.out.println("list2: ");
        ListNode list2 = null;
        for (int i = 0; i < size2; i++) {
            int val = sc.nextInt();
            if (list2 == null) {
                list2 = new ListNode(val);
                list2.next = null;
            } else {
                ListNode p = new ListNode(val);
                p.next = list2;
                list2 = p;
            }
        }
        //do {
        //    System.out.print(list2.val + " ");
        //    if (list2.next == null) break;
        //    else list2 = list2.next;
        //} while( true );
        //System.out.println();

        //ListNode ret = addTwoNumbers(list1, list2);
        ListNode ret = addTwoNumbersOptimized(list1, list2);
        do {
            System.out.print(ret.val + " ");
            if (ret.next == null) break;
            else ret = ret.next;
        } while( true );
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        while ( true  ) {
            list1.add(l1.val);
            if (l1.next == null) break;
            else l1 = l1.next;
        }

        while ( true  ) {
            list2.add(l2.val);
            if (l2.next == null) break;
            else l2 = l2.next;
        }

        ListNode ret = null;
        List<Integer> retList = new ArrayList<Integer>();
        int length = 0;
        if (list1.size() > list2.size()) {
            length = list1.size();
            for(int i=length-list2.size(); i>0; i--) {
                list2.add(0);
            }
        } else if (list1.size() < list2.size()) {
            length = list2.size();
            for(int i=length-list1.size(); i>0; i--) {
                list1.add(0);
            }
        } else {
            length = list1.size();
        }
        int posSum = 0;
        int advance = 0;
        for(int i=0; i<length; i++) {
            posSum = 0;
            if (list1.get(i) == null) {
                posSum = list2.get(i);
            } else if (list2.get(i) == null) {
                posSum = list1.get(i);
            } else {
                posSum = list1.get(i) + list2.get(i);
            }
            if (advance == 1) {
                posSum = posSum + 1;
            }
            if (posSum >= 10) {
                advance = 1;
                posSum -= 10;
            } else {
                advance = 0;
            }
            retList.add(posSum);
        }
        if (advance == 1) retList.add(1);
        Collections.reverse(retList);
        for(Integer each : retList) {
            if (ret == null) {
                ret = new ListNode(each);
            } else {
                ListNode p = new ListNode(each);
                p.next = ret;
                ret = p;
            }

        }
        return ret;
    }

    public static ListNode addTwoNumbersOptimized(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode ret = null;
        ListNode curr = null;
        int carry = 0;
        int x = 0, y = 0, sum = 0;

        while(p != null || q != null) {
            x = p != null ? p.val : 0;
            y = q != null ? q.val : 0;
            sum = x + y + carry;
            carry = sum / 10;
            if (ret == null) {
                ret = new ListNode(sum % 10);
                curr = ret;
            } else {
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(1);
            curr = curr.next;
        }

        return ret;
    }

}

