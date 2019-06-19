package com.lizhao.Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** 
* @author by lizhao
* @version 2019年6月17日 下午3:19:43 
* 类说明 
HashSet.集合的实现之一,它是一种存储不重复值的数据结构
*/
public class Test {
    /*
     * Template for using hash set to find duplicates.
     */
    boolean findDuplicates(List<?> keys) {
        // Replace Type with actual type of your key
        Set<Integer> hashset = new HashSet<>();
        for (Object key : keys) {
            if (hashset.contains(key)) {
                return true;
            }
            hashset.add((Integer) key);
        }
        return false;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer,Integer> c = new HashMap<>();
        c.put(1, 2);
        c.put(2, 3);
        c.put(1, 3);
        
        System.out.println(c);
    }

}
