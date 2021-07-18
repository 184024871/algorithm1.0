package com.iflytek.com.algorithm;

import java.util.ArrayList;
import java.util.List;
// 删除重复的字符串
public class DeleteDuplicateString {

    public static void main(String[] args) {
        String str = "aabbccddeefg";

//        char[] chars = str.toCharArray();
        List list = new ArrayList(12);
        StringBuffer charStr = new StringBuffer(12);
        for (int i = 0; i < str.length() ; i++) {
            if (!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
                charStr.append(str.charAt(i));
            }
        }
        System.out.println("Result:" + charStr);
    }

}
