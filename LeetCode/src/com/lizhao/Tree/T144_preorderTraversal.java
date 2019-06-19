package com.lizhao.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
* @author by lizhao
* @version 2019年6月18日 下午12:29:20 
* 类说明 
给定一个二叉树，返回它的前序遍历。
*/
public class T144_preorderTraversal {
    //迭代，使用栈
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) { 
            return new ArrayList<>();
        }else{
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);//先将根节点压栈
            while(!stack.isEmpty()) {//栈不为空时循环
                TreeNode temp = stack.pop();//栈顶元素出栈
                list.add(temp.val);//访问栈顶元素
                if(temp.right!=null) {//先让右孩子进栈
                    stack.push(temp.right);
                }
                if(temp.left!=null) {//再使左孩子进栈
                    stack.push(temp.left);
                }
            }
            return list;
        }
       
        
    }

}
