package com.learn.threadDemo;

public class BaoZiPu extends Thread{

    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi){
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        int count = 0;
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == true){
                    try {
                        baoZi.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0){
                    //生产薄皮三鲜馅包子
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜馅";
                }else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺整在生产："+baoZi.pi+baoZi.xian+"baozi ");

                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子已经生产好了："+baoZi.pi+baoZi.xian+"baozi ");
            }
        }

    }
}
