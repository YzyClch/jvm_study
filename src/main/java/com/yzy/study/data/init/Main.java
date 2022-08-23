package com.yzy.study.data.init;

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
}
