package com.lizhao.Tree;
/** 
* @author by lizhao
* @version 2019年6月20日 下午3:23:06 
* 类说明 

*/
public class T104_maxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return left_height>right_height?left_height+1:right_height+1;
        }
    }

}
