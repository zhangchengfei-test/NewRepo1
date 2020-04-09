package com.learn.doudizhu;

import java.util.*;

public class DouDiZhuWithMap {
    public static void main(String[] args) {
        doudizhu();
    }

    private static void doudizhu() {
        //准备牌
        HashMap<Integer,String> poker = new HashMap<>();

        //创建list存储map集合key
        ArrayList<Integer> list = new ArrayList<>();

        //存储牌
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        //JDK9中list集合中静态方法of可以添加多个参数到集合  List.of(....);
        Collections.addAll(colors,"♥","♦","♣","♠");
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");

        poker.put(0,"大王");
        poker.put(1,"小王");
        int i = 2;
        for (String color : colors) {
            for (String number : numbers) {
                poker.put(i,color+number);
                i++;
            }
        }

        //存储牌的索引
        List<Integer> keys = new ArrayList<>();
        for (int j = 0; j < 54; j++) {
            keys.add(j);
        }

        Collections.shuffle(keys);

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> leavePoker = new ArrayList<>();

        int count = 0;
        for (Integer key : keys) {
            if(count >= 51){
                leavePoker.add(key);
            }else if (count % 3 == 0){
                player1.add(key);
            }else if (count % 3 == 1){
                player2.add(key);
            }else if (count % 3 == 2){
                player3.add(key);
            }
            count++;
        }

        //排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(leavePoker);

        //看牌
        lookPoker("1",player1,poker);
        lookPoker("2",player2,poker);
        lookPoker("3",player3,poker);
        lookPoker("0",leavePoker,poker);
    }

    public static void lookPoker(String name,List<Integer> keys,HashMap<Integer,String> poker){
        System.out.print(name+" : ");
        for (Integer key : keys) {
            String playerPoker = poker.get(key);
            System.out.print(playerPoker);
        }
        System.out.println();
    }

}
