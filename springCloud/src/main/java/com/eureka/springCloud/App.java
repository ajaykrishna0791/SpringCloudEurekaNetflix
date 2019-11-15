package com.eureka.springCloud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        List<String> l = new ArrayList<String>();
        String s1 = "ajay";
        String s2 = "asdsd";
        String s3 = new String("nnnnn");

//        l.get(0);
        l.add(s1);
        l.add(s2);
        l.add(s3);
//        System.out.println( "Hello World!" + l.toString() );
//        s2="wwww";
//        s3 = new String("aaaa");
//        System.out.println( "Hello World!" + l.toString() );
//        List<Employee> l1 = new ArrayList<Employee>();
//        Employee e1 = new Employee("ajay", 12);
//        l1.add(e1);
//        System.out.println( "Hello World!" + l1.toString() );
//        e1.setName("asdsad");
//        System.out.println( "Hello World!" + l1.toString() );

        String ss = "aasdsad^{dfdf";
//        l.stream().filter();
        ss = ss.replace("^{","{");
        System.out.println( "Hello World!" + ss);

//        Map map = new HashMap();
//        StringBuilder sb = new StringBuilder("java");
//        sb.append(s1);
//        sb.substring(4);
//        System.out.println( "Hello World!" + sb);
//        System.out.println( "Hello World!" + sb.indexOf(s1));
//
//        abs a = new App();
//        a.m1();

        l.get(4);



    }
}
