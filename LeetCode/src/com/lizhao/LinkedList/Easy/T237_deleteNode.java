package com.lizhao.LinkedList.Easy;
/** 
* @author by lizhao
* @version 2019年6月4日 下午7:09:08 
* 类说明 
*编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点
*/
public class T237_deleteNode {

    public void deleteNode(ListNode node) {
        //在无法找到被删除指针的前一个节点时，可交换后面节点的值
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
