package com.leetcode;

/**
 * Created by xwz on 2018/6/12.
 */
public class AddTwoNums {

    public static ListNode addtwoSums(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        if(l1 == null || l2 == null){
            return result;
        }

        int value1 = 0, value2 = 0, value = 0, step = 0;
        ListNode temp = result;
        while(l1 != null || l2 != null){
            if(l1 != null){
                value1 = l1.val;
            }else{
                value1 = 0;
            }
            if(l2 != null){
                value2 = l2.val;
            }else{
                value2 = 0;
            }

            value = value1 + value2 + step;
            if(value >= 10){
                value = value % 10;
                step = 1;
            }else{
                step = 0;
            }
            temp.val = value;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

            if(l1 == null && l2 == null){
                continue;
            }else{
                ListNode node = new ListNode(0);
                temp.next = node;
                temp = node;
            }
        }

        if(step == 1){
            ListNode node = new ListNode(0);
            temp.next = node;
            node.val = 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] l1 = new int[]{1,2,3};
        int[] l2 = new int[]{2,5,7,9};
        ListNode head1 = genLinkList(l1);
        ListNode head2 = genLinkList(l2);

        ListNode head = addtwoSums(head1, head2);
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode genLinkList(int[] values){
        ListNode head = new ListNode(0);
        ListNode temp = head;

        int length = values.length;
        for(int i = 0 ; i < length; i++){
            temp.val = values[i];
            if(i < length - 1){
                ListNode node = new ListNode(0);
                temp.next = node;
                temp = node;
            }
        }
        return head;
    }

    public static class ListNode{
        public int val;
        public ListNode next;

        ListNode(int x) { val = x; }
    }


}
