package com.iflytek.com.algorithm;

public class GetUnDuplicateStrCount {

    public static void main(String[] args) {
        String str = "aabbcefgcddeefg";

        int maxUnDuplicate = getMaxUnDuplicate(str);
        System.out.println("最大不重复数为：" + maxUnDuplicate);


//        char[] chars = str.toCharArray();
//        int maxCount = 1;
//        int temp = 1;
//        for (int i = 0; i < chars.length - 1; i++) {
//            if (chars[i] != chars[i+1]){
//                maxCount = maxCount + 1;
//                if (maxCount > temp){
//                    temp = maxCount;
//                }
//            }else {
//                temp = maxCount;
//                maxCount = 1;
//            }
//        }
//        System.out.println("最大不重复字符串长度为：" + temp);

    }

    private static int getMaxUnDuplicate(String str) {
        int lastMaxLength = 1;
        int startIdx = 1;
        int maxLength = 1;

        if (str == null || "".equals(str)){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            int idx = str.indexOf(str.charAt(i), startIdx);
            if (idx != -1 && i > idx){
                if (maxLength > lastMaxLength){
                    lastMaxLength = maxLength;
                }
                startIdx = idx +1;
                maxLength = i - idx;
            }else {
                maxLength = maxLength +1;
            }

        }
        if (lastMaxLength > maxLength){
            return lastMaxLength;
        }
        return maxLength;
    }

}
