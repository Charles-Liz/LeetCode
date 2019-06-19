package com.lizhao.LinkedList.Easy;
/** 
* @author by lizhao
* @version 2019年5月30日 下午4:13:26 
*  类说明 
*  删除链表中等于给定值 val的所有节点(**删除节点离不开前驱结点**)
*  输入: 1->2->6->3->4->5->6, val = 6  输出: 1->2->3->4->5
*/
public class T203_removeElements {
    //?
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);//初始化一个头结点（哨兵值的选择？）
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while(pre.next!=null) {
            if(pre.next.val==val) {
                pre.next = pre.next.next;//?赋值和指针指向的区别
            }else {
                pre = pre.next;
            }
        }
        return dummyNode.next;
    }
}


