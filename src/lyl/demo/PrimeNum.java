package lyl.demo;

/**
 * @author LiYingLong
 * @version 1.0.0
 * @ClassName PrimeNum.java
 * @Description 判断101-200之间有多少个素数，并输出所有素数。
 * @createTime 2019年08月15日 14:09
 */

//某数一直从2除到其平均数，如果能整除则不是素数
public class PrimeNum {
    public static boolean prime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int j = 101; j <= 200; j++) {
            if (prime(j) == true) {
                System.out.println(j);
            }
        }
    }
}