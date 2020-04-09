package com.learn.demo2;

import javax.jws.soap.SOAPBinding;

public class Computer {

    public void on(){
        System.out.println("开机");
    }

    public void off(){
        System.out.println("关机");
    }

    public void useDevices(USB usb){
        usb.open();

        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.type();
        }
        usb.close();
    }

}
