package com.example.day12.Test6;

public class Demo2 extends People {
    private String skill;

    public Demo2() {
    }

    public Demo2(String name, char sex, String skill) {
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
