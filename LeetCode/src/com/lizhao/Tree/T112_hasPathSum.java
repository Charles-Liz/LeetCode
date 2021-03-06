package com.lizhao.Tree;
/** 
* @author by lizhao
* @version 2019年6月23日 下午4:58:43 
* 类说明 
给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
*/
public class T112_hasPathSum {
    public boolean hasPathSum(TreeNode root,int sum) {
        if(root==null) return false;
        sum = sum-root.val;
        if((root.left==null)&&root.right==null)
            return sum==0;
        return hasPathSum(root.right,sum)||hasPathSum(root.left,sum);
    }
}
