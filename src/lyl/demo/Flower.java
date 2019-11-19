package lyl.demo;

/**
 * @author LiYingLong
 * @version 1.0.0
 * @ClassName Flower.java
 * @Description 打印出所有的 “水仙花数 “，所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 “水仙花数 “，因为153=1的三次方＋5的三次方＋3的三次方。
 * @createTime 2019年08月15日 16:38
 */
public class Flower {
    public static boolean flower(int x) {
        int i = x / 100;
        int j = (x % 100) / 10;
        int k = x % 10;
        if (x == i * i * i + j * j * j + k * k * k) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int a = 100; a <= 999; a++) {
            if (flower(a)==true){
                System.out.println(a);
            }
        }
    }
}