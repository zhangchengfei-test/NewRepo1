package com.learn.demo2;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.on();

        USB usbMouse = new Mouse();

        computer.useDevices(usbMouse);

        KeyBoard keyBoard = new KeyBoard();

        computer.useDevices(keyBoard);



        computer.off();
    }
}
