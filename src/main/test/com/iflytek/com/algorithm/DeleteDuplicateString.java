package com.iflytek.com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicateString {

    public static void main(String[] args) {
        String str = "aabbccddeefg";

        char[] chars = str.toCharArray();
        List list = new ArrayList(12);
        StringBuffer charStr = new StringBuffer(12);
        for (int i = 0; i < chars.length -1 ; i++) {
            if (!list.contains(chars[i])){
                list.add(chars[i]);
                charStr.append(chars[i]);
            }
        }
        System.out.println("Result:" + charStr);
    }

}
