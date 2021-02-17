package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class AppStartEvent implements ApplicationListener<ContextStartedEvent> {


    public void onApplicationEvent(ContextStartedEvent event)

    {
        System.out.println("监听dubbo_service start回调监听");
    }



}
