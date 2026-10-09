package case01;

import java.util.Random;

public class ShopApp {
    public static void main(String[] args) {
        Producer producer = Producer.getInstance();  // 商家只能有一个对象
        Consumer consumer = new Consumer();
        Random random = new Random();

        while (true) {
            // 原料用完了，并且柜台上也没有美食了，说明今天的 10 份都卖完了
            if (producer.getInventory() == 0 && Container.getNum() == 0) {
                System.out.println("今日已售罄！");
                return;
            }
            // 随机决定这一步是“商家制作”还是“顾客购买”
            if (random.nextInt(2) == 0) {
                producer.makeGoods();
            } else {
                consumer.getGoods();
            }
        }
    }
}
