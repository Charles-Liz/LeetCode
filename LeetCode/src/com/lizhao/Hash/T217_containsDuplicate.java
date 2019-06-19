package com.lizhao.Hash;

import java.util.HashSet;
import java.util.Set;

/** 
* @author by lizhao
* @version 2019年6月17日 下午3:36:21 
* 类说明 
给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
*/
public class T217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(hashSet.contains(nums[i])) {
                return true;
            }else {
                hashSet.add(nums[i]);
            }
        }
        return false;
        
    }

}
