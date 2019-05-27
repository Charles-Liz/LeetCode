package com.lizhao.easy;
/*
 * String,int之间的转换
 * StringBuffer到String的转换
 * try-catch解决溢出的问题
 */
public class T7Reverse {
    public static int reverse(int x) {
        int result=0;
        int flag = x<0?-1:1;
        try {
        String s =String.valueOf(Math.abs(x));
        StringBuffer sb = new StringBuffer(s);
        result = flag*Integer.parseInt(sb.reverse().toString());
        return result;
        }catch (Exception e) {
            // TODO: handle exception
            return 0;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      System.out.println(reverse(1534236469));
    }

}
