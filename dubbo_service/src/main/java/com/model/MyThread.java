package com.model;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    @Override
    public void run() {
        Thread t=Thread.currentThread();
        User user=App.getCurrentUser();
        if(user!=null){
           user=new User("当前线程开始有未清空的用户数据");
        }else{
            App.setCurrentUser();
            user=App.getCurrentUser();

        }
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss-SSS");
        String str=sdf.format(date);
        System.out.println(str+"当前线程ID："+t.getId()+"当前线程Name："+t.getName()+"User："+ JSON.toJSONString(user));

        App.clearCurrentThreadUser();

    }

}
