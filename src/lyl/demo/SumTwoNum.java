package lyl.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SumTwoNum
 * @Description leecode 第一题：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @Author liyinglong
 * @Date 2019/11/19 11:31 下午
 * @Version 1.0
 **/
public class SumTwoNum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                int index[] = new int[]{map.get(other), i};
                System.out.println(Arrays.toString(index));
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        SumTwoNum st = new SumTwoNum();
        st.twoSum(new int[]{1, 4, 6, 7, 3}, 10);
    }
}
