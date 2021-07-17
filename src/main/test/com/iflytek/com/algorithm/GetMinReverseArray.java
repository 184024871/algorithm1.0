package com.iflytek.com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class GetMinReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] reverseArr = {1,5,6,7,2,3,4};

        // 方法一，如果减少空间的话，使用冒泡查询
        int min = getMinByBubble(reverseArr);

        // 方法二，如果减少时间的话，使用二分法分段查询


        if (min < 0){
            System.out.println("数据异常，请处理：" + Arrays.toString(reverseArr));
        }else {
            System.out.println("最大值-冒泡：" + min);
        }

    }

    private static int getMinByBubble(int[] reverseArr) {
        if (reverseArr.length > 0){
            for (int i = 0; i < reverseArr.length - 1; i++) {
                int temp = 0;
                for (int j = 0; j < reverseArr.length - i - 1; j++) {
                    if (reverseArr[j] > reverseArr[j+1]){
                        temp = reverseArr[j];
                        reverseArr[j] = reverseArr[j+1];
                        reverseArr[j+1] = temp;
                    }
                }
            }
            return reverseArr[reverseArr.length - 1];
        }
        return -1;
    }
}
