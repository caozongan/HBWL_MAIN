package com.hbwl.java.bean;

import com.hbwl.bean.Hello;
import com.hbwl.test.HelloWorld;

import java.util.ArrayList;

/**
 * Created by cza 2021-01-13 19:13
 */
public class Demo {

    ArrayList list=new ArrayList();

    public static void main(String[] args) {
        com.hbwl.bean.Hello hello =new com.hbwl.bean.Hello();
        System.out.println("get"+ hello.sayHello("cza"));
    }
}
