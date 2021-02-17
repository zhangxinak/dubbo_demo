package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class AppCloseEvent implements ApplicationListener<ContextClosedEvent> {
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("程序close回调监听");
    }
}
