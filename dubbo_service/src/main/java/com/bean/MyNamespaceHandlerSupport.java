package com.bean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandlerSupport extends NamespaceHandlerSupport {


    public void init() {

        System.out.println("zx.xsd 文件被加载了");


        registerBeanDefinitionParser("mb", new MyBeanDefinitionParser());



    }

}
