package com.lizhao.Hash;

import java.util.HashMap;
import java.util.Map;

/** 
* @author by lizhao
* @version 2019年6月17日 下午3:42:49 
* 类说明 
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
*/
public class T136_singleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i], 1);
            }
        }
        for(Integer i:hashMap.keySet()) {
            if(hashMap.get(i)==1) return i;
        }
        return 0;
    }
    //使用异或
    public int singleNumber1(int[] nums) {
//      任何数于0异或为任何数 0 ^ n => n
//      相同的数异或为0: n ^ n => 0
        int ans = nums[0];
        for(int i=1;i<nums.length;i++) {
            ans=ans^nums[i];
        }
        return ans;
    }
}
