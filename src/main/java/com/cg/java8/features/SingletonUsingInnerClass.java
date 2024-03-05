package com.cg.java8.features;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class SingletonUsingInnerClass {

    private SingletonUsingInnerClass(){}

    private static class InnerClass{
        public final SingletonUsingInnerClass SINGLETON_USING_INNER_CLASS = new SingletonUsingInnerClass();
    }

    public static SingletonUsingInnerClass getSingletonObject(){
        return new InnerClass().SINGLETON_USING_INNER_CLASS;
    }
}
