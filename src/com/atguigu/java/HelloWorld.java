package com.atguigu.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class HelloWorld {
    public static void main(String[] args ){
        System.out.println("hello world!!!");
        System.out.println("nihao,这是中国文字");
        ArrayList list = new ArrayList();
        Map<String,String> map = new HashMap<>();
        CopyOnWriteArrayList<String> cwlist = new CopyOnWriteArrayList<String>();



    }

    public static int sum(int a,int b){
        int sum;
        sum = a+b;
        System.out.println(sum);
        return  sum;

    }
}
