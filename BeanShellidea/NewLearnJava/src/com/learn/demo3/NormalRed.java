package com.learn.demo3;

import com.learn.red.OpenMode;

import java.util.ArrayList;

public class NormalRed implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> arr = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        int lastAvg = avg + mod;
        for (int i = 0; i < totalCount-1; i++) {
            arr.add(avg);
        }
        arr.add(lastAvg);

        return arr;
    }
}
