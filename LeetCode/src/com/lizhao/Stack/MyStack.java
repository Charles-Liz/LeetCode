package com.lizhao.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
* @author by lizhao
* @version 2019年6月11日 上午9:32:30 
* 类说明 
当你想首先处理最后一个元素时，栈将是最适合的数据结构
*/
public class MyStack {
    private List<Integer> data; //store elements

    public MyStack() {
        data = new ArrayList<>();
    }
    //insert an element into the stack 
    public void push(int x) {
        data.add(x);
    }
    //check whether the queue is empty or not
    public boolean isEmpty() {
        return data.isEmpty();
    }
    //get the top item from the queue
    public int top() {
        return data.get(data.size()-1);
    }
    //delete an item from the queue
    public boolean pop() {
        if(isEmpty()==true) return false;
        data.remove(data.size()-1);
        return true;
    }
    public int getMin() {
        
        return 0;
        
        
    }


    public static void main(String[] args) {
        //Stack<Integer> s = new Stack<Integer>();
        MyStack s = new MyStack();
        s.push(3);
        s.push(2);
        s.pop();
        System.out.println(s.top());
        
    }

}
