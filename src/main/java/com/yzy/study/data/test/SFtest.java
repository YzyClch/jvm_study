package com.yzy.study.data.test;

public class SFtest {



    private static class Father{

        int x=10;

        Father(){
            this.print();//子类调用打印的就是子类的属性，这时候就是0
            x=20;
        }

        public void print() {

            System.out.println("father x:"+x);
        }


    }



    private static class Son extends Father{

        int x =30;
        Son(){
//            print();
            x=40;
        }

        @Override
        public void print() {
//            super.print();
            System.out.println("son x:"+x);
        }
    }


    public static void main(String[] args) {
        Father f=new Son();
        System.out.println(f.x);
        f.print();
    }





}
