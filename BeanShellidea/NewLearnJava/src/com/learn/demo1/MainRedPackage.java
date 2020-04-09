package com.learn.demo1;

import java.util.ArrayList;

public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member member = new Member("成员",0);
        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员2",0);

        ArrayList<Integer> arr = manager.send(10, 3);

        member.receive(arr);
        member1.receive(arr);
        member2.receive(arr);

        manager.show();
        member.show();
        member1.show();
        member2.show();


    }
}
