package com.learn.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {

    public static void main(String[] args) {
        //1、准备牌
        //定义一个存储54张牌的ArrayList集合。泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义2个数组，一个数组存储花色，一个存储牌序号
        String[] flowers = {"♣","♦","♠","♥"};
        String[] pokerNums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //把大小王存入集合
        poker.add("大王");
        poker.add("小王");

        //循环遍历把52张牌存入集合
        for (String flower : flowers) {
            for (String pokerNum : pokerNums) {
                poker.add(flower+pokerNum);
            }
        }

        System.out.println(poker);

        // 洗牌  工具类 Collections
        // static void shuffle(List<?> list){} 随机置换集合中元素的位置
        Collections.shuffle(poker);
        
        //发牌
        ArrayList<String> gamer1 = new ArrayList<>();
        ArrayList<String> gamer2 = new ArrayList<>();
        ArrayList<String> gamer3 = new ArrayList<>();
        ArrayList<String> leavePoker = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >=51){
                leavePoker.add(p);
            }else if (i % 3 == 0){
                gamer1.add(p);
            }else if (i % 3 == 1){
                gamer2.add(p);
            }else if (i % 3 == 2){
                gamer3.add(p);
            }
        }

        System.out.println("1:"+gamer1);
        System.out.println("2:"+gamer2);
        System.out.println("3:"+gamer3);
        System.out.println("4:"+leavePoker);

    }

}
