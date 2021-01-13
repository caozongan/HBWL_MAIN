package com.hbwl.java.bean;
import com.hbwl.bean.Hello;

import java.util.ArrayList;

/**
 * Created by cza 2021-01-13 19:13
 */
public class Demo {

    ArrayList list=new ArrayList();

    public static void main(String[] args) {
        Hello hello =new Hello();
        System.out.println("get"+ hello.sayHello("cza"));
    }
}
