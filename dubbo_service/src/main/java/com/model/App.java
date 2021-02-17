package com.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    private static ClassPathXmlApplicationContext context;

    private static ExecutorService  THREAD_POOL= null;

    private static ThreadLocal<User> CURRENT_USER=new ThreadLocal<User>();

    public static  ExecutorService getThreadPool(){

        if(THREAD_POOL==null){
            THREAD_POOL=Executors.newFixedThreadPool(5);
        }
        return THREAD_POOL;
    }

    public static User getCurrentUser(){
        return CURRENT_USER.get();
    }


    public static void setCurrentUser(){

        String name= UUID.randomUUID().toString();
        User user=new User(Thread.currentThread().getId(),name);
        CURRENT_USER.set(user);

    }


    public static void clearCurrentThreadUser(){

        CURRENT_USER.set(null);
    }


    public static ClassPathXmlApplicationContext getContext() {
        return context;
    }

    public static void setContext(ClassPathXmlApplicationContext context) {
        App.context = context;
    }
}
