package com.yzy.study.data.init;

import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        /**
         * 上述代码运行之后，只会输出“SuperClass init！”，而不会输出“SubClass init！”。对于静态字段，
         * 只有直接定义这个字段的类才会被初始化，因此通过其子类来引用父类中定义的静态字段，只会触发
         * 父类的初始化而不会触发子类的初始化。至于是否要触发子类的加载和验证阶段，在《Java虚拟机规
         * 范》中并未明确规定，所以这点取决于虚拟机的具体实现。对于HotSpot虚拟机来说，可通过-XX：
         * +TraceClassLoading参数观察到此操作是会导致子类加载的。
         */
        System.out.println(Sub.value); //
    }


    @Test
    public void testArray(){
        Super[] as=new Super[10];
    }

    @Test
    public void testFinal(){
        /**
         * 被动使用类字段演示三：
         * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的
         * 类的初始化
         */
        System.out.println(Sub.xx); // 常量已存储到常量池中
    }
}
