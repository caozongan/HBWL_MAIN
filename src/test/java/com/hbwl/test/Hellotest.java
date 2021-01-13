package com.hbwl.test;

import com.hbwl.bean.Hello;
import org.junit.Test;

/**
 * Created by cza 2021-01-13 10:56
 */
public class Hellotest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String h =hello.sayHello("cza");
        System.out.println(h);
    }
}
