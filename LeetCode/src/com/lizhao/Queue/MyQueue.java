package com.lizhao.Queue;

import java.util.ArrayList;
import java.util.List;

/** 
* @author by lizhao
* @version 2019年6月10日 上午9:45:11 
* 类说明 
为了实现队列，我们可以使用动态数组和指向队列头部的索引。
*/
public class MyQueue {
    //store elements
    private List<Integer> data;
    //a pointer to indicate the start position 
    private int p_start;
    public MyQueue() {
        data = new ArrayList<>();
        p_start = 0;
    }
    //insert an element into the queue.Return true if the operation is successful
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }
    //Delete an element from the queue
    public boolean deQueue(int x) {
        if(isEmpty()==true) return false;
        p_start++;
        return true;
    }
    //get the front item from the queue
    public int Front() {
        return data.get(p_start);
    }
    //check whether the queue is empty or not
    public boolean isEmpty() {
        return p_start>=data.size();
    }
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(3);
        q.enQueue(4);
        System.out.println(q.deQueue(3));
        System.out.println(q.Front());
        System.out.println(q.isEmpty());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
