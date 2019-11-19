package lyl.demo;

/**
 * @author LiYingLong
 * @version 1.0.0
 * @ClassName RabbitPrac.java
 * @Description 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * @createTime 2019年08月15日 11:37
 */

//前1-2月兔子是1对，第三个月变成2对，第四个月3对，第五个月5对，第六个月8对
public class RabbitPrac {
    public static int rabbit(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return rabbit(x - 1) + rabbit(x - 2);
        }
    }

    public static void main(String[] args) {
        for (int j = 1; j <= 12; j++) {
            System.out.println(rabbit(j));
        }
    }
}