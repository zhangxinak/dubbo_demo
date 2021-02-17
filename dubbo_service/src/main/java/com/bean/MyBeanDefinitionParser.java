package com.bean;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class MyBeanDefinitionParser implements BeanDefinitionParser {

    public BeanDefinition parse(Element element, ParserContext parserContext) {

        System.out.println("My bean is coming!" + JSON.toJSONString(element));
        MyBeanDefinition mb=new MyBeanDefinition() ;

        String id ="zx" ;
        mb.setBeanClassName(MyResolveBean.class.getName());
        mb.setBeanClass(MyResolveBean.class);
        mb.setDescription("MyBeanDefinitionParser desc");
        mb.setAttribute("age","18");

//        mb.setFactoryBeanName();


        parserContext.getRegistry().registerBeanDefinition(id, mb);
        return mb;

    }
}
