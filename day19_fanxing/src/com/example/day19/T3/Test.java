package com.example.day19.T3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BMW> bms = new ArrayList<>();
        bms.add(new BMW());
        go(bms);

        ArrayList<LX> lxs = new ArrayList<>();
        lxs.add(new LX());
        go(lxs);
    }

    public static void go(ArrayList<? extends Car> cars) {

    }
}
