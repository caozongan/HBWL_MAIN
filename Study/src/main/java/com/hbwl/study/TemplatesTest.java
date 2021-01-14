package com.hbwl.study;


import com.hbwl.bean.Hello;
import com.hbwl.study.bean.Customer;
import com.hbwl.web_ssh.bean.Station;


import java.util.ArrayList;

/**
 * Created by cza 2021-01-14 8:22
 */
public class TemplatesTest {
    //模板007: prsf
    private static final int prsf=0;
    private static final Customer cust=new Customer();
    private static final Station station=new Station();
    
    
    //模板001：psvm
    public static void main(String[] args) {

        //模板008
        ArrayList lt = new ArrayList();//Alt Enter;
        lt.add(123);
        //模板002：sout
        System.out.println("Hello!");
        //变形：soutp,soutm soutv xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("true = " + true);
        Hello hello = new Hello();
        //soutv 就近选择变量
        System.out.println("hello = " + hello.sayHello("ttt"));
        int num1=10;
        int num2=12;
        //xxx.sout num1.sout
        System.out.println(num1);

        //模板003 fori
        for (int i = 0; i <200 ; i++) {

        }
        String[] arr= new String[]{"Tom","Jerry","HanMeimei","LiLei"};
        for (int i = 0; i <arr.length ; i++) {
            //arr.sout
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            //s.sout
            System.out.println(s);
        }
        //模板004 list.for
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(23);
        list.add("222");
        //list.for 增强型
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori 顺序
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板005
        //ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {

        }
        //变形 list.nn list.null
        if (list != null) {

        }
        if (list == null) {

        }
        //模板006


    }
}
