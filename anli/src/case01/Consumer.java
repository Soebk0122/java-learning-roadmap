package case01;

public class Consumer {
    /** 购买一份美食 */
    public void getGoods() {
        if (Container.remove()) {   // 柜台里还有美食，取走一份
            System.out.println("顾客：成功购买到美食");
        } else {                    // 柜台空了，只能等商家制作
            System.out.println("请稍等，还在制作中！");
        }
    }
}