package com.lizhao.Tree;
/** 
* @author by lizhao
* @version 2019年6月20日 下午3:43:54 
* 类说明 
判断一棵树是否为对称二叉树
*/
public class T101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2) {
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        return t1.val==t2.val&&
                isMirror(t1.left, t2.right)&&
                isMirror(t1.right, t2.left);
    }
}
