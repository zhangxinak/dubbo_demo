package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class AppRefreshEvent implements ApplicationListener<ContextRefreshedEvent> {


    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("监听dubbo_service refresh回调监听");
    }


//    public AppStartEvent(Object source) {
//        super(source);
//        System.out.println("程序启动后回调监听");
//    }
}
