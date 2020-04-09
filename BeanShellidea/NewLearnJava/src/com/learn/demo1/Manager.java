package com.learn.demo1;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){}

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){

        //用来存储红包金额
        ArrayList<Integer> arr = new ArrayList<>();

        int leftMoney = super.getMoney();

        //首先判断金额是否足够
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return arr;
        }

        //扣钱
        super.setMoney(leftMoney - totalMoney);

        //发红包均分
        int avgMoney = totalMoney / count;
        //除不尽的情况
        int modMoney = totalMoney % count;

        int lastMoney = avgMoney + modMoney;

        for (int i = 0; i < count - 1; i++) {
            arr.add(avgMoney);
        }

        arr.add(lastMoney);

        return arr;
    }

}
