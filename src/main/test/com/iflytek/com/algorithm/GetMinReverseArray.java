package com.iflytek.com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class GetMinReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] reverseArr = {1,5,6,7,2,3,4,8};

        // 方法一，如果减少空间的话，使用冒泡查询
        int minBubble = getMinByBubble(reverseArr);

        // 方法二，如果减少时间的话，使用二分法分段查询
//        int target = reverseArr[(int) ((Math.random()*10)%7+1)];
        int target = 8;
        int minByBinary = getMinByBinary(reverseArr, target);

        if (minByBinary < 0){
            System.out.println("数据异常，请处理：" + Arrays.toString(reverseArr));
        }else {
            System.out.println("最大值-冒泡：" + minBubble);
            System.out.println("最大值-二分法，查询的：" + target + "在第" + minByBinary + "个");
        }

    }

    private static int getMinByBinary(int[] reverseArr, int target) {
        int countTime = 0;
        // 1.取中间值，分段查询数值
        int low = 0;
        int high = reverseArr.length - 1;
        while (low <= high){
            countTime ++;
            int mid = (low + high) / 2;
            if (target < reverseArr[mid]){
                high = mid - 1;
            }else if (target > reverseArr[mid]){
                low = mid + 1;
            }else if (target == reverseArr[mid]){
                System.out.println("二分法共查询了：" + countTime + "次");
                return mid + 1;
            }
        }
        return -1;
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
