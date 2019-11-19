package lyl.demo;

/**
 * @author LiYingLong
 * @version 1.0.0
 * @ClassName RepeatNum.java
 * @Description 找出数组中重复的数，数组值在 [1, n] 之间 二分查找
 * @createTime 2019年08月15日 20:50
 */
public class RepeatNum {
    public int findDuplicate(int[] nums) {
        int i = 1;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RepeatNum re = new RepeatNum();
        int [] array={1,2,3,2,3};
        System.out.println(re.findDuplicate(array));
    }
}
