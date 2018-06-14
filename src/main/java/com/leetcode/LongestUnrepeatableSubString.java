package com.leetcode;

import java.util.HashSet;

/**
 * Created by xwz on 2018/6/13.
 */
public class LongestUnrepeatableSubString{


    public static int lengthOfLongestSubstring(String s) {
        int result = 0;

        int length = s.length();
        for(int i = 0; i < length; i++){
            char temp = s.charAt(i);
            HashSet<Character> charSet = new HashSet<Character>();
            charSet.add(temp);
            for(int j = i+1; j < length; j++){
                if(charSet.contains(s.charAt(j))){
                    result = charSet.size() > result ? charSet.size() :result;
                }else{
                    charSet.add(s.charAt(j));
                }
            }
        }
        return result;
    }


    public static int method2(String str){
        int result = 0;
        HashSet<Character> charSet = new HashSet<Character>();
        int i = 0, j  = 0;
        while(j < str.length()){
            if(i < j && charSet.contains(str.charAt(j))){
                charSet.remove(str.charAt(i));
                i++;
            }else{
                charSet.add(str.charAt(j));
                j++;
            }
            result = charSet.size() > result ? charSet.size():result;
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "a";
        System.out.println(method2(str));

    }


}