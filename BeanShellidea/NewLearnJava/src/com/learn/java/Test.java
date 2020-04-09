package com.learn.java;

import com.monix.fundamental.security.core.utils.base.AESUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static int i = 0;

    public static void main(String[] args) {
        String s = AESUtils.encrypt("1234","Wq8kOk7ymKcxgRJZy8Ya9Y40EQKNxpSCjkt9enbug5w=","Wq8kOk7ymKcxgRJZy8Ya9Y40EQKNxpSCjkt9enbug5w=");

        System.out.println(s);
        //simpleDateFormat1();
        //calendar1();
        //system1();
        //stringBuilder1();
        //stringTest();
       // test();
        //calc("",5);
//        fanxing();
        //insertSort();
        //arrayTest();
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

    //计算一个字符串每个字符出现的次数
    public static void calendarStr(){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] chars = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();


        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                Integer value = map.get(chars[i]);
                value++;
                map.put(chars[i],value);
            }else {
                map.put(chars[i],1);
            }
        }

        Set<Character> characters = map.keySet();

        for (Character character : characters) {
            Integer integer = map.get(character);
            System.out.println("字符："+character +" 出现了："+integer+"次！");
        }

    }

    //已知一个队列,如： [1, 3, 5, 7], 如何把第一个数字，放到第三个位置，得到：[3, 5, 1, 7]
    public static void arrayTest(){
        /*LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList,1,3,5,7);
        Integer remove = linkedList.remove(0);
        linkedList.add(2,remove);*/

        int[] arr = {1,6,7,45,3};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(i == 3){
                arr2[i] = arr[0];
            }else if (i > 3){
                arr2[i] = arr[i];
            }else {
                arr2[i] = arr[i+1];
            }
        }

        System.out.println(Arrays.toString(arr2));
    }

    //打印出100-999所有的”水仙花数”，所谓”水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
    public static void findNum(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            int a = i%10;
            int b = i/10%10;
            int c = i/100;
            int result = a*a*a + b*b*b + c*c*c;
            if (result == i)
                arrayList.add(i);
        }
        System.out.println(arrayList);
    }

    //如果一个数恰好等于它的因子之和，则称该数为“完全数”，又称完美数或完备数。求1000以内的完全数有哪些？
    public static void findNum1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j ==0){
                    sum += j;
                }
            }
            if (sum == i)
                arrayList.add(i);
        }
        System.out.println(arrayList);
    }

    //冒泡排序
    public static void bubbleSort(){
        int[] arr = {1,2,5,6,8,4,3,2};
        int temp = 0;
        //冒泡
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = arr.length - 1; i1 > i ; i1--) {
                if (arr[i1] > arr[i1 + 1]){
                    temp = arr[i1 + 1];
                    arr[i1 + 1] = arr[i1];
                    arr[i1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    public static void selectSort(){
        int[] arr = {1,2,5,6,8,4,3,2};
        int temp ;
        int k ;
        for (int i = 0; i < arr.length-1; i++) {
            k = i;
            for (int i1 = i; i1 < arr.length; i1++) {
                if (arr[i1] < arr[k]){
                    k =i1;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //插入排序
    public static void insertSort(){
        int[] arr = {1,2,5,6,8,4,3,2};

        int temp ;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int k = i;
            while ( k > 0 && arr[k-1] >= temp ){
                arr[k] = arr[k-1];
                k--;
            }
            arr[k] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void simpleDateFormat1(){
        long nowDate = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);

        String birthDate = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date birthbay = dateFormat.parse(birthDate);

            long birthbayTime = birthbay.getTime();

            long ageTime = nowDate - birthbayTime;

            System.out.println(ageTime / 1000 / 60 / 60 / 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void calendar1(){
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        System.out.println(year +""+ month + day);
    }

    public static void system1(){
        int[] arr = {1,2,3,4,5,6};
        int[] desc = {4,5,6,7,8,9};
        System.out.println("---"+Arrays.toString(arr));
        System.arraycopy(arr,0,desc,0,3);
        System.out.println("+++"+Arrays.toString(desc));
    }

    public static void stringBuilder1(){
        StringBuilder stringBuilder = new StringBuilder("222");
        stringBuilder.append(1).append(2);
        stringBuilder.delete(1,2);
        System.out.println(stringBuilder);
    }

    public static void iteratar1(){
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

    public static void foreach1(){
        Collection<String> c = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7};
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        for (int i : arr){
            System.out.println(i);
        }
        for (String i : c){
            System.out.println(i);
        }
    }

    public static void fanxing(){
        ArrayList<String> a = new ArrayList<>();
        a.add("2");
        a.add("3");

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);

        printArray(a);
        printArray(b);
    }

    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void stringTest(){
        String str = "ertyuio345678";

        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes();

        System.out.println(chars[1]);

        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(chars));
    }

    public static void test(){
        int a = 0 ;
        int b = 1;

        while (b < 100){
            System.out.print(b + " ,");
            //a = b;
            b = a + b;
            a = b - a ;
        }

    }

    public static int mi(int a,int b){
        if ( b == 0){
            return 1;
        }else {
            return a * mi(a,b-1);
        }
    }

    public static void hanoi(int n,String a,String b,String c){
        if(n == 1){
            move(n,a,c);
        }else {
            //从a-->b
            hanoi(n-1,a,c,b);
            move(n,a,c);
            hanoi(n-1,b,a,c);
        }
    }

    private static void move(int n, String a, String c) {
        System.out.println("第："+n +"个圆盘，从"+ a+ "移动到"+c );
    }

    public static String findSubStr(String str) {
        Map<Character, Integer> indexMap = new HashMap<>();
        if (null == str || str.isEmpty()) {
            return str;
        }
        char[] tmpList = new char[str.length()];
        String result = null;
        int tmpLength = 0;
        for (int i = 0; i < str.length();) {
            char c = str.charAt(i);
            if (indexMap.get(c) == null) {
                indexMap.put(c, i);
                tmpList[tmpLength++] = c;
                i++;
            } else {
                if (null == result || result.length() < tmpLength) {
                    result = new String(tmpList, 0, tmpLength);
                }
                tmpLength = 0;
                i = indexMap.get(c) + 1;
                indexMap.clear();
            }
        }
        if (null == result || result.length() < tmpLength) {
            result = new String(tmpList, 0, tmpLength);
        }
        return result;
    }

    public static String findSubStrImprove1(String str) {
        Map<Character, Integer> indexMap = new HashMap<>();
        if (null == str || str.isEmpty()) {
            return str;
        }
        int preStart = 0;
        int preEnd = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length();) {
            char c = str.charAt(i);
            if (indexMap.get(c) == null) {
                indexMap.put(c, i);
            } else {
                if ((preEnd - preStart) < (end - start)) {
                    preStart = start;
                    preEnd = end;
                }

                start = indexMap.get(c) + 1;
                for(int j = 0; j < start; j++){
                    indexMap.remove(str.charAt(j));
                }
                /*
                System.out.print("counting " + i + " th char:" + c + ", appeared before, current longest: "
                + str.substring(preStart, preEnd) + ",start = "+ preStart+",end = " +preEnd + "\t");
                System.out.println("now start = " + start);*/
                indexMap.put(c, i);
            }
            i++;
            end++;
        }
        if ((preEnd - preStart) >= (end - start)) {
            start = preStart;
            end = preEnd;
        }
        return str.substring(start, end);
    }

    //上楼梯每次只需一步或者两步，有多少走法
    public static void calc(String log, int num){
        if (num == 0) {
            i++;
            System.out.println(log.substring(0,log.length()-1));
            return;
        }else if(num == 1) {
            i++;
            System.out.println(log+"1");
            return;
        }
        calc(log+"1,", num - 1);
        calc(log+"2,", num - 2);
    }
}
