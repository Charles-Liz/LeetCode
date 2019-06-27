package com.lizhao.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
* @author by lizhao
* @version 2019年6月18日 下午2:56:35 
* 类说明 
二叉树中序遍历[左根右]
*/
public class T94_inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty()||temp!=null) {
            while(temp!=null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            list.add(temp.val);
            temp = temp.right;
        }
        return list;
    }

}
