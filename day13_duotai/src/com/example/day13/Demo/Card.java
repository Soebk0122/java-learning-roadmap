package com.example.day13.Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId;
    private String name;
    private String phone;
    private double money;

    public void deposit(double money) {
        this.money += money;
    }

    public void consume(double money) {
        this.money -= money;
    }
}
