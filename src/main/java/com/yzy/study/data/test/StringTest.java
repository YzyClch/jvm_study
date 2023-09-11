package com.yzy.study.data.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(2,3,4);//       String s1="x";
        System.out.println(a.stream().map(i -> i).filter(i->{
            if (!b.isEmpty()) {
                return b.contains(i);
            }
            return true;
        }).collect(Collectors.toList()));

//       String s2="y";
//        System.out.println("xy"==s1+s2);
//
//        final String s3="xx";
//        final String s4="yy";
//        System.out.println("xxyy"==s3+s4);
//
//
//        String trim = new String("xxxxxx").intern();
//        BigDecimal bigDecimal = new BigDecimal(0);
//        bigDecimal.subtract(new BigDecimal(1));
//        System.out.println(bigDecimal.subtract(new BigDecimal(1)));
//        System.out.println();
//
//        String s3 =new String("a") + new String("b");
////        String s4 ="11";
////        s3=s3.intern();
////        System.out.println(s3==s4);
//        String intern = s3.intern();
//        System.out.println(intern==s3);
//        System.out.println(s3 == "ab");
    }
}
