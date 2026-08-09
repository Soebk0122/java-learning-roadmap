package com.example.day13.Demo;

public class GoldCard extends Card {


    public GoldCard(String carId, String name, String phone, int money) {
        super(carId, name, phone, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格：" + money*0.8);
        if (getMoney() < money*0.8){
            System.out.println("余额不足，请充值");
            return;
        }
        setMoney(getMoney() - money*0.8);

        if (money*0.8 > 200){
            printTicket();
        }else {
            System.out.println("未达到满200元，不能免费洗车");
        }
    }

    public void printTicket(){
        System.out.println("您消费了满200元，请打印洗车票");
    }
}
