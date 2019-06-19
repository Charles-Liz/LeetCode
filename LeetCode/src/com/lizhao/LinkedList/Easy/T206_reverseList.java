package com.lizhao.LinkedList.Easy;
/** 
* @author by lizhao
* @version 2019年6月4日 下午3:29:15 
* 类说明 
反转一个链表
1.迭代2.头插3.递归
*/
public class T206_reverseList {
    
    //迭代法
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;//定义当前节点
        while(curr!=null) {
            ListNode nextTemp = curr.next;
            curr.next = pre;//断开节点,指向前一个
            pre = curr;//并赋值给前一个
            curr = nextTemp;//让下一个节点作为当前节点curr
        }
        return pre;//最后返回前一个节点
        
    }

}
