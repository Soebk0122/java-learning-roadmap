package com.example.day13.Demo;

public class SliverCard extends Card {
    public SliverCard(String carId, String name, String phone, int money) {
        super(carId, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格：" + money * 0.9);
        if (getMoney() < money*0.9) {
            System.out.println("余额不足，请充值");
            return;
        }
        setMoney(getMoney() - money * 0.9);
    }

}