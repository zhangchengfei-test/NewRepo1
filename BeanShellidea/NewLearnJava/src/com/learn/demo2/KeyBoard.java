package com.learn.demo2;

import javax.sound.midi.Soundbank;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("打击键盘");
    }
}
