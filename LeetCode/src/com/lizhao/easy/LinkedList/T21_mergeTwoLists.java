package com.lizhao.easy.LinkedList;

/** 
* @author by lizhao
* @version 2019年5月27日 下午1:58:58 
* 类说明 
将两个有序链表合并为一个新的有序链表并返回。
*/
public class T21_mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode head = null;
        if(l1.val<=l2.val) {
            head =l1;
            head.next = mergeTwoLists(l1.next, l2);
        }else {
            head = l2;
            head.next = mergeTwoLists(l2.next, l1);
        }
        return head;
        
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        
        ListNode l = mergeTwoLists(l1, l2);
        while(l!=null) {
            System.out.print(l.val+" ");
            l = l.next;
        }
    }
    
}
