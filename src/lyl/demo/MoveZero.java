package lyl.demo;

import java.util.Arrays;

/**
 * @author LiYingLong
 * @version 1.0.0
 * @ClassName MoveZero.java
 * @Description TODO
 * @createTime 2019年08月15日 16:56
 */
public class MoveZero {
    public int[] moveZero(int[] array) {
        int in = 0;
        for (int num : array) {
            if (num != 0) {
                array[in++] = num;
            }
        }
        while (in < array.length) {
            array[in++] = 0;
        }
        return array;
    }

    public static void main(String[] args) {
        MoveZero mz = new MoveZero();
        int[] nums = {1, 2, 0, 4, 0, 8};
        System.out.println(Arrays.toString(mz.moveZero(nums)));
    }
}