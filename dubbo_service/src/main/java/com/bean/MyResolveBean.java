package com.bean;

import com.model.User;
import com.proxy.MyInvokerHandler;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MyResolveBean implements FactoryBean {


    public Object getObject() throws Exception {

        MyInvokerHandler handler=new MyInvokerHandler(new User()) ;
        Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
        return proxy;
    }

    public Class<?> getObjectType() {
        return com.model.User.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
