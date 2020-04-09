package com.learn.demo3;

import com.learn.red.OpenMode;
import com.learn.red.RedPacketFrame;

public class Demo3 {
    public static void main(String[] args) {
        /*RedPacketFrame a = new RedPacketFrame("12345") {
            @Override
            public void setOwnerName(String ownerName) {
                super.setOwnerName(ownerName);
            }
        };*/

        MyRed myRed = new MyRed("恭喜发财");
        myRed.setOwnerName("王思聪");

        OpenMode openMode = new NormalRed();

        myRed.setOpenWay(openMode);

    }
}
