package com.lizhao.LinkedList.Easy;
/** 
* @author by lizhao
* @version 2019年5月27日 下午6:28:45 
* 类说明 
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
*/
public class T83_deleteDuplicates {
    private static ListNode deleteDuplicates(ListNode head) {
        /*
         * 1.若首结点与下一节点相同啥的，则删除后一节点，若仍相同，则继续操作。。。
         * 2.把操作完成的结点设置为首结点，继续执行操作
         * 整个递归的终止条件。一级递归需要做什么？应该返回给上一级的返回值是什么？
         */
        ListNode current = head;//把首结点赋值给l
        while(current!=null&&current.next!=null) {
            if(current.val==current.next.val) {
                current.next=current.next.next;
            }else {
                current=current.next;
            }         
        }    
        return head;
    }  

}
