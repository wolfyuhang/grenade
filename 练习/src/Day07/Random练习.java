package Day07;

import java.util.Random;

public class Random练习 {
    public static void main(String[] args) {
        //产生一个0-111的随机数
        //1.创建ranndom对象
        Random rd = new Random();
        int num =rd.nextInt(112);
        System.out.println(num);
        //产生1-111的随机数
        int num2 = rd.nextInt(111)+1;
        System.out.println(num2);
    }
}
