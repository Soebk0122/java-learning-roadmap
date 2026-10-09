package case01;

public class Producer {
    /** 唯一的商家对象，static：属于类，只创建一次 */
    private static Producer producer;

    /** 原料库存：一共 10 份原料，也就是每天只做 10 份美食 */
    private int inventory = 10;

    /** 构造方法私有化，外界不能直接 new 商家对象 */
    private Producer() {
    }

    /** 获取唯一的商家对象 */
    public static Producer getInstance() {
        if (producer == null) {
            producer = new Producer();
        }
        return producer;
    }

    /** 获取当前剩余的原料数量 */
    public int getInventory() {
        return inventory;
    }

    /** 制作一份美食 */
    public void makeGoods() {
        // 还有原料，并且柜台没有达到 3 份，才可以制作
        if (inventory > 0 && Container.getNum() < Container.MAX_NUM) {
            inventory--;        // 用掉一份原料
            Container.add();    // 把做好的美食放到柜台上
            System.out.println("商家：制作完成");
        }
        // 柜台已经有 3 份美食时，这里什么都不做，相当于“暂停制作”
    }
}