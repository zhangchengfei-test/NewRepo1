package com.learn.demo1;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> arrayList){
        int index = new Random().nextInt(arrayList.size());

        int delta = arrayList.remove(index);

        int memberMoney = super.getMoney();

        super.setMoney(memberMoney + delta);
    }
}
