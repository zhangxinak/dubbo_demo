package com.proxy;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokerHandler implements InvocationHandler {


    private Object object;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("被代理的对象"+ JSON.toJSONString(object));
        String str=(String)method.invoke(object,args);
        System.out.println("代理调用方法"+ JSON.toJSONString(method));
        System.out.println("代理调用参数"+ JSON.toJSONString(args));
        System.out.println("代理调用结果"+ JSON.toJSONString(str));
        return str ;
    }

    public MyInvokerHandler(Object object) {
        this.object = object;
    }
}



