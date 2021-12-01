//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 示例 4： 
//
// 
//输入：x = -101
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 👍 1704 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * 取出后半段数字进行翻转
 * 例：121121
 1.revert=1, x=12112
 2.revert=12, x=1211
 3.revert=121, x=121
 * 例：13331
 1.revert=1, x=1333
 2.revert=13, x=133
 3.revert=133, x=13
 x<revert: 满足x == revert / 10
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x <= 10) {
            return false;
        }
        int revert = 0;
        while (x > revert) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }
        return x == revert || x == revert / 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
