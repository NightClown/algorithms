package lyl.demo;

/**
 * @ClassName WordEctopic
 * @Description Leecode 242题:
 * @Author liyinglong
 * @Date 2019/11/19 10:11 下午
 * @Version 1.0
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 首先判断两个字符串长度是否相等，不相等则直接返回 false
 * 若相等，则初始化 26 个字母哈希表，遍历字符串 s 和 t
 * s 负责在对应位置增加，t 负责在对应位置减少
 * 如果哈希表的值都为 0，则二者是字母异位词
 **/
public class WordEctopic {
    public Boolean Word(String s, String t) {
        int[] all_nums = new int[26];

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            all_nums[s.charAt(i) - 'a']++;
            all_nums[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (all_nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordEctopic we = new WordEctopic();
        System.out.println(we.Word("anagram", "nagaram"));
    }
}
