package case01;

public class Container {
    /** 柜台最多能存放的美食份数 */
    public static final int MAX_NUM = 3;

    /** 柜台上当前存放的美食份数（static：柜台只有一份） */
    private static int num = 0;

    /** 获取柜台上美食的份数 */
    public static int getNum() {
        return num;
    }

    /** 往柜台里放一份美食，柜台满了就放不进去，返回 false */
    public static boolean add() {
        if (num >= MAX_NUM) {
            return false;
        }
        num++;
        return true;
    }

    /** 从柜台取走一份美食，柜台空了就取不到，返回 false */
    public static boolean remove() {
        if (num <= 0) {
            return false;
        }
        num--;
        return true;
    }
}
