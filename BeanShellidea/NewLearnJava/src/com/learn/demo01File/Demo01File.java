package com.learn.demo01File;

import javax.crypto.AEADBadTagException;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo01File {

    public static void main(String[] args) {
//        show01();
        int[] arr = {1,3,4,1,3,5};
        Set<Integer> set = new HashSet<>();
        int temp = 0;

        for(int i = 0; i < arr.length ; i++){
            set.add(arr[i]);
        }
        Object[] objects = set.toArray();
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
    }

    public static void show01(){
        File file = new File("D:\\WorkSpace\\a.txt");
        //File file1 = new File("D:\\","a.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader b = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = b.readLine()) != null && !line.startsWith("#")){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
