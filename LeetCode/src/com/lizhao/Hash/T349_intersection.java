package com.lizhao.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** 
* @author by lizhao
* @version 2019年6月18日 上午10:03:02 
* 类说明 
给定两个数组，编写一个函数来计算它们的交集
*/
public class T349_intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i =0;i<nums1.length;i++) {
            set1.add(nums1[i]);
        }
        for(int j =0;j<nums2.length;j++) {
            if(set1.contains(nums2[j])) {
                set2.add(nums2[j]);
            }
        }
        int[] ans = new int[set2.size()];
        int k = 0;
        Iterator it = set2.iterator();
        while(it.hasNext()) {
            ans[k] = (int) it.next();
            k++;
        }
       return ans;
    }

}
