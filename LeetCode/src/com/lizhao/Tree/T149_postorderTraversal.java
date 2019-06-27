package com.lizhao.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
* @author by lizhao
* @version 2019年6月19日 下午2:56:15 
* 类说明 
二叉树的后序遍历[左右根]
*/
public class T149_postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        TreeNode last = null;//用来记住上次被遍历的节点，若上次访问的点是右孩子，则说明右子树已被遍历过
        while(!stack.isEmpty()||temp!=null) {
            while(temp!=null) {
                stack.push(temp);
                temp = temp.left;               
            }
                temp = stack.peek();
                if(temp.right==null||temp.right==last) {
                    list.add(temp.val);
                    last=temp;
                    stack.pop();
                    temp=null;
                }else {
                    temp = temp.right;
                }            
        }
        return list;
        
    }

}
