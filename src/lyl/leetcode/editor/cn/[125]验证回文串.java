//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 445 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        if ("".equals(s)) {
            return true;
        }
        char[] c = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i]+=32;
                newStr.append(c[i]);
            } else if (Character.isDigit(c[i]) || (c[i] >= 'a' && c[i] <= 'z')) {
                newStr.append(c[i]);
            }
        }
        System.out.println(newStr.toString());
        for (int j = 0; j < newStr.length() / 2; j++) {
            if (newStr.charAt(j) != newStr.charAt(newStr.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
