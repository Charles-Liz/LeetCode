package com.lizhao.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** 
* @author by lizhao
* @version 2019年6月19日 下午3:46:07 
* 类说明 
给定一个二叉树，返回其按层次遍历的节点值。
*/
public class T102_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root==null) return levels;
        //Queue<TreeNode> queue = new Queue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            //start the current level
            levels.add(new ArrayList<Integer>());
            
            //number of elements in the current level
            int level_length = queue.size();
            for(int i=0;i<level_length;++i) {
                TreeNode node = queue.remove();
                //fulfill the current level
                levels.get(level).add(node.val);
                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
              }
              // go to next level
              level++;
            }
            return levels;
    }
}