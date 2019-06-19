package com.lizhao.LinkedList.Easy;

import java.util.HashSet;

/** 
* @author by lizhao
* @version 2019年5月28日 上午10:31:17 
* 类说明 

*/
public class T141_Solution {
    
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeSeen = new HashSet();
        while(head!=null) {
            if(nodeSeen.contains(head)) {
                return true;
            }else {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
