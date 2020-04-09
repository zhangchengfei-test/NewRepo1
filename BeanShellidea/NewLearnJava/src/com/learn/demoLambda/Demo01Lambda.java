package com.learn.demoLambda;

public class Demo01Lambda {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("older Thread:"+Thread.currentThread().getName());
            }
        }).start();

        new Thread(()->System.out.println("new Thread:"+Thread.currentThread().getName())).start();
    }
}
